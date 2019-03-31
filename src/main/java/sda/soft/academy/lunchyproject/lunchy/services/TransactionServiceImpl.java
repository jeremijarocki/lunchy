package sda.soft.academy.lunchyproject.lunchy.services;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sda.soft.academy.lunchyproject.lunchy.converters.TransactionConverter;
import sda.soft.academy.lunchyproject.lunchy.converters.TransactionDtoConverter;
import sda.soft.academy.lunchyproject.lunchy.dto.CatererDto;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;
import sda.soft.academy.lunchyproject.lunchy.entities.Transaction;
import sda.soft.academy.lunchyproject.lunchy.entities.TransactionStatus;
import sda.soft.academy.lunchyproject.lunchy.exceptions.TransactionNotFoundException;
import sda.soft.academy.lunchyproject.lunchy.repository.TransactionRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private TransactionConverter transactionConverter;

    @Autowired
    private TransactionDtoConverter transactionDtoConverter;

    @Override
    @Transactional
    public void save(TransactionDto transactionDto) {
        Transaction transaction = transactionConverter.apply(transactionDto);
        transaction.setTransactionDate(LocalDate.now());
        transaction.setTransactionStatus(TransactionStatus.IN_PREPARATION);
        transactionRepository.save(transaction);
    }

    @Override
    public TransactionDto findById(Long id) throws TransactionNotFoundException {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        if(transaction.isPresent()) {
            return transactionDtoConverter.apply(transaction.get());
        } else {
            throw new TransactionNotFoundException("We couldn't find transaction with no - "+id+" in our databse");
        }
    }

    @Override
    public List<TransactionDto> findAllTransactions() {
            Iterable<Transaction> transactions = transactionRepository.findAll();
            List<Transaction> transactionList = Lists.newArrayList(transactions);
            return transactionList.stream().map(transactionDtoConverter).collect(Collectors.toList());
        }
    }

