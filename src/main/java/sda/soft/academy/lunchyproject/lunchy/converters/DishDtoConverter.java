package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;

import java.util.function.Function;

@Component
public class DishDtoConverter implements Function<Dish, DishDto> {
    @Override
    public DishDto apply(Dish dish) {
        return new DishDto(dish.getId(), dish.getName(), dish.getPrice(), dish.getDishType().name(), dish.getCatererId().getId());
    }
}
