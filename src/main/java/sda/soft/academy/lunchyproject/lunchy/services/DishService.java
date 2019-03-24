package sda.soft.academy.lunchyproject.lunchy.services;

import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;

import java.util.List;

public interface DishService {

    //Dodwanie, usuwanie i edytowanie
    void save(Dish dish);

    void delete(Long dishId);

    List<DishDto> findDishes(Long catererId);

    List<DishDto> findAllDishes();
}
