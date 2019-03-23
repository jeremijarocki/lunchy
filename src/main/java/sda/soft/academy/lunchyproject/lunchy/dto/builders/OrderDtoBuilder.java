package sda.soft.academy.lunchyproject.lunchy.dto.builders;

import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderItemDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderDtoBuilder {

    private Long id;
    private Long userId;
    private LocalDateTime date;
    private List<OrderItemDto> dishes;

    public OrderDtoBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public OrderDtoBuilder userId(Long userId) {
        this.userId = userId;
        return this;
    }

    public OrderDtoBuilder date(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public OrderDtoBuilder addItem(Long dishId) {
        if (dishes == null) {
            dishes = new ArrayList<OrderItemDto>();
        }
        OrderItemDto orderItemDto = new OrderItemDto();
        orderItemDto.setDishId(dishId);
        dishes.add(orderItemDto);

        return this;
    }

    public OrderDto build (){
        OrderDto orderDto = new OrderDto(id, userId, date);
        orderDto.setDishDtoList(dishes);
        return orderDto;
    }
}
