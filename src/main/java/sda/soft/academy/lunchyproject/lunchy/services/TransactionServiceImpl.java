package sda.soft.academy.lunchyproject.lunchy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sda.soft.academy.lunchyproject.lunchy.converters.TransactionConverter;
import sda.soft.academy.lunchyproject.lunchy.converters.TransactionDtoConverter;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Transaction;
import sda.soft.academy.lunchyproject.lunchy.entities.TransactionStatus;
import sda.soft.academy.lunchyproject.lunchy.exceptions.TransactionNotFoundException;
import sda.soft.academy.lunchyproject.lunchy.repository.TransactionRepository;

import java.time.LocalDate;
import java.util.Optional;

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
}
