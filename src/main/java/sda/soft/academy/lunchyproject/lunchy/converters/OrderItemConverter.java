package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderItemDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;
import sda.soft.academy.lunchyproject.lunchy.entities.Order;
import sda.soft.academy.lunchyproject.lunchy.entities.OrderItem;
import sda.soft.academy.lunchyproject.lunchy.repository.DishRepository;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.BiFunction;

@Component
public class OrderItemConverter implements BiFunction<OrderItemDto, Order, OrderItem> {

    @Autowired
    private DishRepository dishRepository;

    @Override
    public OrderItem apply(OrderItemDto orderItemDto, Order order) {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrder(order);

        //TODO rozwiąż ten problem, nie wiem z czego to wynika
        Long dishId = orderItemDto.getDishId();
        Optional<Dish> dish = dishRepository.findById(dishId);
        dish.ifPresent(dish2 -> orderItem.setDish(dish2));

        return orderItem;
    }
}
