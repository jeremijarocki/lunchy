package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderItemDto;
import sda.soft.academy.lunchyproject.lunchy.entities.*;
import sda.soft.academy.lunchyproject.lunchy.repository.CatererRepository;
import sda.soft.academy.lunchyproject.lunchy.repository.TransactionRepository;
import sda.soft.academy.lunchyproject.lunchy.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class OrderConverter implements Function<OrderDto, Order> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private OrderItemConverter orderItemConverter;

    @Autowired
    private CatererRepository catererRepository;

    @Override
    public Order apply(OrderDto orderDto) {
        Order order = new Order();
        order.setId(orderDto.getId());

        Optional<User> user = userRepository.findById(orderDto.getUserId());
        if(user.isPresent()) {
            order.setUser(user.get());
        }

        if(orderDto.getDishDtoList() != null) {
            List<OrderItem> orderItems = orderDto.getDishDtoList()
                    .stream()
                    .map(orderItemDto -> orderItemConverter.apply(orderItemDto,order))
                    .collect(Collectors.toList());

            order.setDishList(orderItems);
        }

        Optional<Transaction> transaction = transactionRepository.findById(orderDto.getTransactionId());
        if (transaction.isPresent()) {
            order.setTransaction(transaction.get());
        }

        Optional<Caterer> caterer = catererRepository.findById(orderDto.getCatererId());
        if(caterer.isPresent()) {
            order.setCatererId(caterer.get());
        }
        return order;
    }
}
