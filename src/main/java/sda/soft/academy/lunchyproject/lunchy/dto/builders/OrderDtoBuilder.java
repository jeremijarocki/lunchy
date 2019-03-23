package sda.soft.academy.lunchyproject.lunchy.dto.builders;

import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderItemDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderDtoBuilder {

//TODO dlaczego w tym builderze nie ma 2 pól z klasy OrderDto? Czy w takim razie poprawnie on się buduje?

    private Long id;
    private Long userId;
    private LocalDateTime date;
    private List<OrderItemDto> dishes;

//      brakuje poniższych dwóch pól
//    private Long catererId;
//    private Long transactionId;

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
//TODO dlaczego tutaj są tylko trzy pola w parametrze? A gdzie są pozostałe? Lista jest dodana później, ale brakuje jeszcze 2 pól
    public OrderDto build (){
        OrderDto orderDto = new OrderDto(id, userId, date);
        orderDto.setDishDtoList(dishes);
        return orderDto;
    }
}
