package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;
import sda.soft.academy.lunchyproject.lunchy.entities.DishType;
import sda.soft.academy.lunchyproject.lunchy.repository.CatererRepository;

import java.util.Optional;
import java.util.function.Function;

@Component
public class DishConverter implements Function<DishDto, Dish> {

    @Autowired
    private CatererRepository catererRepository;

    @Override
    public Dish apply(DishDto dishDto) {
        String dishType = dishDto.getDishType();
        DishType type = DishType.valueOf(dishType);

        Optional<Caterer> caterer = catererRepository.findById(dishDto.getCatererId());

        return new Dish(dishDto.getId(), dishDto.getName(), dishDto.getPrice(), type, caterer.get());
    }
}
