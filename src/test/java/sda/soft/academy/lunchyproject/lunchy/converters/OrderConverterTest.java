package sda.soft.academy.lunchyproject.lunchy.converters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.dto.builders.OrderDtoBuilder;
import sda.soft.academy.lunchyproject.lunchy.entities.Order;

import java.util.function.Function;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderConverterTest {

    @Autowired
    private Function<OrderDto, Order> orderConverter;

    @Test
    public void shouldConvertOrderDto() {
        //TODO
        //z uzyciem OdderDtoBuilder
    }

}