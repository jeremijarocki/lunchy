package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionItemDto;
import sda.soft.academy.lunchyproject.lunchy.entities.TransactionItem;

import java.util.function.Function;

@Component
public class TransactionItemDtoConverter implements Function<TransactionItem, TransactionItemDto> {
    @Override
    public TransactionItemDto apply(TransactionItem transactionItem) {
        TransactionItemDto transactionItemDto = new TransactionItemDto();
        transactionItemDto.setId(transactionItem.getId());
        transactionItemDto.setOrderId(transactionItem.getOrder().getId());

        return transactionItemDto;
    }
}
