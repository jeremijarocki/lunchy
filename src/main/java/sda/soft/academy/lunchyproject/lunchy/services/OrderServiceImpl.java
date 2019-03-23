package sda.soft.academy.lunchyproject.lunchy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.soft.academy.lunchyproject.lunchy.converters.OrderConverter;
import sda.soft.academy.lunchyproject.lunchy.converters.OrderDtoConverter;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Order;
import sda.soft.academy.lunchyproject.lunchy.exceptions.OrderNotFoundException;
import sda.soft.academy.lunchyproject.lunchy.repository.OrderRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderConverter orderConverter;

    @Autowired
    private OrderDtoConverter orderDtoConverter;

    @Override
    public void save(OrderDto orderDto) {
        Order order = orderConverter.apply(orderDto);
        order.setOrderDate(LocalDateTime.now());
        orderRepository.save(order);
    }

    @Override
    public OrderDto findById(Long id) throws OrderNotFoundException {
        Optional<Order> order = orderRepository.findById(id);
        if (order.isPresent()) {
            return orderDtoConverter.apply(order.get());
        } else {
            throw new OrderNotFoundException("We couldn't find such order no - " + id + " in our database");
        }
    }

}
