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
    private Long catererId;
    private Long transactionId;

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

    public OrderDtoBuilder catererId(Long catererId) {
        this.catererId = catererId;
        return this;
    }

    public OrderDtoBuilder transactionId(Long transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public OrderDtoBuilder addItem(List<Long> dishIds) {
        if (dishes == null) {
            dishes = new ArrayList<OrderItemDto>();
        }
        for (Long id : dishIds) {
            OrderItemDto orderItemDto = new OrderItemDto();
            orderItemDto.setDishId(id);
            dishes.add(orderItemDto);
        }
        return this;
    }

    public OrderDto build (){
        OrderDto orderDto = new OrderDto(id, userId, catererId, date, transactionId);
        orderDto.setDishDtoList(dishes);
        return orderDto;
    }
}
