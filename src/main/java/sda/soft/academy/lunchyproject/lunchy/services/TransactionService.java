package sda.soft.academy.lunchyproject.lunchy.services;

import sda.soft.academy.lunchyproject.lunchy.dto.CatererDto;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionDto;
import sda.soft.academy.lunchyproject.lunchy.exceptions.TransactionNotFoundException;

import java.util.List;

public interface TransactionService {

    void save (TransactionDto transactionDto);
    TransactionDto findById (Long id) throws TransactionNotFoundException;
    List<TransactionDto> findAllTransactions();

}
