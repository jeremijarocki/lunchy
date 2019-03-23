package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;
import sda.soft.academy.lunchyproject.lunchy.entities.DishType;

import java.util.function.Function;

@Component
public class DishConverter implements Function<DishDto, Dish> {

    @Override
    public Dish apply(DishDto dishDto) {
        String dishType = dishDto.getDishType();
        DishType type = DishType.valueOf(dishType);

        return new Dish(dishDto.getId(), dishDto.getName(), dishDto.getPrice(), type);
    }
}
