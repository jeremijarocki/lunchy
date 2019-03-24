package sda.soft.academy.lunchyproject.lunchy.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.TRANSACTION_MODE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import sda.soft.academy.lunchyproject.lunchy.asserts.OrderAssert;
import sda.soft.academy.lunchyproject.lunchy.asserts.TransactionAssert;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionDto;
import sda.soft.academy.lunchyproject.lunchy.dto.builders.OrderDtoBuilder;
import sda.soft.academy.lunchyproject.lunchy.dto.builders.TransactionDtoBuilder;
import sda.soft.academy.lunchyproject.lunchy.entities.Order;
import sda.soft.academy.lunchyproject.lunchy.entities.Transaction;
import sda.soft.academy.lunchyproject.lunchy.exceptions.OrderNotFoundException;
import sda.soft.academy.lunchyproject.lunchy.exceptions.TransactionNotFoundException;
import sda.soft.academy.lunchyproject.lunchy.repository.TransactionRepository;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)

public class TransactionServiceImplTest {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private TransactionRepository transactionRepository;

    @Test
    public void shouldSaveTransactionWithOrders() {
        TransactionDto transactionDto = new TransactionDtoBuilder()
                .id(1l)
                .catererId(1l)
                .addItem(Arrays.asList(1l, 2l))
                .status("IN PREPARATION")
                .build();
        transactionService.save(transactionDto);

        Optional<Transaction> transaction = transactionRepository.findById(1l);
        new TransactionAssert(transaction.get()).hasOrders(2).hasCatererId(1l);
    }

    @Test
    public void shouldSaveTransactionWithoutOrders() {
        TransactionDto transactionDto = new TransactionDtoBuilder()
                .id(3l)
                .catererId(1l)
                .status("IN PREPARATION")
                .build();

        transactionService.save(transactionDto);
        Optional<Transaction> transaction = transactionRepository.findById(3l);
        new TransactionAssert(transaction.get()).hasOrders(0).hasCatererId(1l);
    }

    @Test
    public void shouldFindTransactionWithoutOrders() throws TransactionNotFoundException {
        TransactionDto transactionDto = transactionService.findById(3l);
        Assert.assertEquals(1, transactionDto.getCatererId().longValue());
    }

    //     oba sqlowe pliki sie uruchamiają i dlatego numeracja z pliku testowego leci dalej, zamiast zaczać się od nowa.
//    transaction testowy o numerze 3 (w data.sql), tutaj ma już numer 5.
//    ordery też się dodają wedle ten sumarycznej numeracji i pierwsza transakcja na 4 ordery zamiast 2

    @Test
    public void shouldFindTransactionWithDishes() throws TransactionNotFoundException {
        TransactionDto transactionDto = transactionService.findById(1l);
        Assert.assertEquals(4, transactionDto.getOrderList().size());
    }
}