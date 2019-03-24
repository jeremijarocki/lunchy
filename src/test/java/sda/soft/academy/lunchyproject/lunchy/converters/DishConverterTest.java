package sda.soft.academy.lunchyproject.lunchy.converters;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sda.soft.academy.lunchyproject.lunchy.asserts.DishAssert;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;

import java.math.BigDecimal;
import java.util.function.Function;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DishConverterTest {

    @Autowired
    private Function<DishDto, Dish> dishConverter;

    @Test
    public void shouldConvertDishDto() {
        //GIVEN
        DishDto dishDto = new DishDto(1L, "TIKKA MASALA", BigDecimal.valueOf(19.99), "MEAT", 1L);
        //WHEN
        Dish dish = dishConverter.apply(dishDto);
        //THEN
        new DishAssert(dish).hasId(1L).hasName("TIKKA MASALA").hasPrice(BigDecimal.valueOf(19.99)).
                hasType(dish.getDishType()).hasCaterer(dish.getCatererId());
    }
}