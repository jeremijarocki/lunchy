package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderItemDto;
import sda.soft.academy.lunchyproject.lunchy.entities.OrderItem;

import java.util.function.BiFunction;
import java.util.function.Function;

@Component
public class OrderItemDtoConverter implements Function<OrderItem, OrderItemDto> {

    @Override
    public OrderItemDto apply(OrderItem orderItem) {
        OrderItemDto orderItemDto = new OrderItemDto();
        orderItemDto.setId(orderItem.getId());
        orderItemDto.setDishId(orderItem.getDish().getId());

        return orderItemDto;
    }
}
