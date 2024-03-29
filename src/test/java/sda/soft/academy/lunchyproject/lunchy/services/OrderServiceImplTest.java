package sda.soft.academy.lunchyproject.lunchy.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import sda.soft.academy.lunchyproject.lunchy.asserts.OrderAssert;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.dto.builders.OrderDtoBuilder;
import sda.soft.academy.lunchyproject.lunchy.entities.Order;
import sda.soft.academy.lunchyproject.lunchy.exceptions.OrderNotFoundException;
import sda.soft.academy.lunchyproject.lunchy.repository.OrderRepository;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void shouldSaveOrderWithDishes() {
        OrderDto orderDto = new OrderDtoBuilder()
                .id(1l)
                .userId(1l)
                .addItem(Arrays.asList(1l, 2l))
                .catererId(1l)
                .transactionId(1l)
                .build();
        orderService.save(orderDto);

        Optional<Order> order = orderRepository.findById(1l);
        new OrderAssert(order.get()).hasDishes(2).hasUserLogin("tester");
    }

    @Test
    public void shouldSaveOrderWithoutDishes() {
        OrderDto orderDto = new OrderDtoBuilder()
                .id(4l)
                .userId(2l)
                .catererId(1l)
                .transactionId(1l)
                .build();

        orderService.save(orderDto);
        Optional<Order> order = orderRepository.findById(4l);
        new OrderAssert(order.get()).hasDishes(0).hasUserLogin("Jeremi");
    }

    @Test
    public void shouldFindOrderWithoutDishes() throws OrderNotFoundException {
        Optional<Order> order = orderRepository.findById(6l);
        new OrderAssert(order.get()).hasDishes(0).hasUserLogin("Kamil");
}

    @Test
    public void shouldFindOrderWithDishes() throws OrderNotFoundException {
        Optional<Order> order = orderRepository.findById(2l);
        new OrderAssert(order.get()).hasDishes(3).hasUserLogin("Jeremi");
    }
}
