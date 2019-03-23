package sda.soft.academy.lunchyproject.lunchy.converters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sda.soft.academy.lunchyproject.lunchy.asserts.OrderDtoAssert;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Order;

import java.time.LocalDateTime;
import java.util.function.Function;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDtoConverterTest {

    @Autowired
    private Function<Order, OrderDto> orderDtoConverter;

    @Test
    public void shouldConvertOrder() {
//        //GIVEN
//        Order order = new Order();
//        order.setId(1L);
//        order.setOrderDate(LocalDateTime.of(2019, 3, 16, 12, 5));
//        //WHEN
//        OrderDto orderDto = orderDtoConverter.apply(order);
//        //THEN
//        new OrderDtoAssert(orderDto).hasId(1L).hasOrderDate(LocalDateTime.of(2019, 3, 16, 12, 5));
    }

}