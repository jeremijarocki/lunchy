package sda.soft.academy.lunchyproject.lunchy.dto.builders;

import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderItemDto;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionDto;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionItemDto;

import java.util.ArrayList;
import java.util.List;

public class TransactionDtoBuilder {

    private Long id;
    private Long catererId;
    private List<TransactionItemDto> orders;
    private String status;

    public TransactionDtoBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public TransactionDtoBuilder catererId (Long catererId) {
        this.catererId = catererId;
        return this;
    }

    public TransactionDtoBuilder status (String status) {
        this.status = status;
        return this;
    }

    public TransactionDtoBuilder addItem(List<Long> orderIds) {
        if (orders == null) {
            orders = new ArrayList<TransactionItemDto>();
        }
        for (Long id : orderIds) {
            TransactionItemDto transactionItemDto = new TransactionItemDto();
            transactionItemDto.setOrderId(id);
            orders.add(transactionItemDto);
        }
        return this;
    }

    public TransactionDto build (){
        TransactionDto transactionDto = new TransactionDto(id, catererId, status);
        transactionDto.setOrderList(orders);
        return transactionDto;
    }
}
