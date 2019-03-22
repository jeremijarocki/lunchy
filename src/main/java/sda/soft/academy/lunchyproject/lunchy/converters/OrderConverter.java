package sda.soft.academy.lunchyproject.lunchy.converters;

import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.entities.*;
import sda.soft.academy.lunchyproject.lunchy.repository.MenuRepository;
import sda.soft.academy.lunchyproject.lunchy.repository.OrderRepository;
import sda.soft.academy.lunchyproject.lunchy.repository.TransactionRepository;
import sda.soft.academy.lunchyproject.lunchy.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Component
public class OrderConverter implements Function<OrderDto, Order> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Order apply(OrderDto orderDto) {
        Order order = new Order();
        order.setId(orderDto.getId());

        Optional<User> user = userRepository.findById(orderDto.getUserId());
        if(user.isPresent()) {
            order.setUser(user.get());
        }
        Optional<Menu> menu = menuRepository.findById(orderDto.getMenuId());
        if (menu.isPresent()){
            order.setMenuId(menu.get());
        }
        //TODO skończ to!
//        if(orderDto.getDishDtoList() != null) {
//            List<OrderItem> orderItems = orderDto.getDishDtoList()
//                    .stream()
//                    .map(orderItemDto -> )
//        }

        order.setOrderDate(LocalDateTime.now());

        Optional<Transaction> transaction = transactionRepository.findById(orderDto.getTransactionId());
        if (transaction.isPresent()) {
            order.setTransaction(transaction.get());
        }
        return order;
    }
}
