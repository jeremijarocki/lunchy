package sda.soft.academy.lunchyproject.lunchy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionDto;
import sda.soft.academy.lunchyproject.lunchy.exceptions.TransactionNotFoundException;
import sda.soft.academy.lunchyproject.lunchy.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void save(TransactionDto transactionDto) {

    }

    @Override
    public TransactionDto findById(Long id) throws TransactionNotFoundException {
        return null;
    }
}
