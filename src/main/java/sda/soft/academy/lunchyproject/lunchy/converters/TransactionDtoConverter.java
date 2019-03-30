package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionDto;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionItemDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Transaction;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class TransactionDtoConverter implements Function<Transaction, TransactionDto> {

    @Autowired
    private TransactionItemDtoConverter transactionItemDtoConverter;

    @Override
    public TransactionDto apply(Transaction transaction) {
        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setId(transaction.getId());
        transactionDto.setCatererId(transaction.getCaterer().getId());
        if (transaction.getOrdersList() != null) {
            List<TransactionItemDto> orders = transaction.getOrdersList()
                    .stream().map(transactionItemDtoConverter)
                    .collect(Collectors.toList());

            transactionDto.setOrderList(orders);
        }
        transactionDto.setTransactionStatus(transaction.getTransactionStatus().name());
        transactionDto.setAdditionalComments(transaction.getAdditionalComments());
        transactionDto.setCompanyId(transaction.getCompany().getId());
        transactionDto.setUserId(transaction.getUser().getId());

        return transactionDto;
    }
}
