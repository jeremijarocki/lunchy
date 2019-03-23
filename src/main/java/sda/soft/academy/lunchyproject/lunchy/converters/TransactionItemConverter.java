package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionItemDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Order;
import sda.soft.academy.lunchyproject.lunchy.entities.Transaction;
import sda.soft.academy.lunchyproject.lunchy.entities.TransactionItem;
import sda.soft.academy.lunchyproject.lunchy.repository.OrderRepository;

import java.util.Optional;
import java.util.function.BiFunction;

@Component
public class TransactionItemConverter implements BiFunction<TransactionItemDto, Transaction, TransactionItem> {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public TransactionItem apply(TransactionItemDto transactionItemDto, Transaction transaction) {
        TransactionItem transactionItem = new TransactionItem();
        transactionItem.setTransaction(transaction);

        Long orderId = transactionItemDto.getOrderId();
        Optional<Order> order = orderRepository.findById(orderId);
        order.ifPresent(order1 -> transactionItem.setOrder(order1));

        return transactionItem;
    }
}
