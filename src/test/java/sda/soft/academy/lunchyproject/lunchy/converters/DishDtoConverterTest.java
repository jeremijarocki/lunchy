package sda.soft.academy.lunchyproject.lunchy.converters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sda.soft.academy.lunchyproject.lunchy.asserts.DishDtoAssert;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;
import sda.soft.academy.lunchyproject.lunchy.entities.DishType;
import sda.soft.academy.lunchyproject.lunchy.repository.CatererRepository;

import java.math.BigDecimal;
import java.util.function.Function;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DishDtoConverterTest {

    @Autowired
    private Function<Dish, DishDto> dishConverter;

    @Autowired
    private CatererRepository catererRepository;

    @Test
    public void shouldConvertDish() {
        //GIVEN
        Dish dish = new Dish(2L, "SCHABOWY Z ZIEMNIAKAMI I SURÓWKĄ", BigDecimal.valueOf(13.99),
                DishType.MEAT, catererRepository.findById(2L).get());
        //WHEN
        DishDto dishDto = dishConverter.apply(dish);
        //THEN
        new DishDtoAssert(dishDto).hasId(2L).hasName("SCHABOWY Z ZIEMNIAKAMI I SURÓWKĄ");
    }

}