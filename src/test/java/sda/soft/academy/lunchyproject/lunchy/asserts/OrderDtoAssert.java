package sda.soft.academy.lunchyproject.lunchy.asserts;

import org.junit.Assert;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;

import java.time.LocalDateTime;

public class OrderDtoAssert {

    private OrderDto orderDto;

    public OrderDtoAssert(OrderDto orderDto) {
        this.orderDto = orderDto;
    }

    public OrderDtoAssert hasId(Long expectedId) {
        Assert.assertEquals(expectedId, orderDto.getId());
        return this;
    }

    public OrderDtoAssert hasOrderDate(LocalDateTime expectedDate) {
        Assert.assertEquals(expectedDate, orderDto.getOrderDate());
        return this;
    }
}
