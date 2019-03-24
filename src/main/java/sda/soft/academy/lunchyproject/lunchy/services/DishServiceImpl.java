package sda.soft.academy.lunchyproject.lunchy.services;

import org.springframework.beans.factory.annotation.Autowired;
//import sda.soft.academy.lunchyproject.lunchy.dao.DishDao;
//import sda.soft.academy.lunchyproject.lunchy.dao.DishDaoImpl;
import org.thymeleaf.expression.Lists;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;
import sda.soft.academy.lunchyproject.lunchy.repository.DishRepository;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DishServiceImpl implements DishService {


//    private DishDao dishDao = new DishDaoImpl();

    @Autowired
    private DishRepository dishRepository;

    @Autowired
    private Function<Dish, DishDto> dishDtoConverter;

    @Override
    public void save(Dish dish) {

    }

    @Override
    public void delete(Long dishId) {

    }

    @Override
    public List<DishDto> findDishes(Long catererId) {
        Optional<List<Dish>> dishes = dishRepository.findAllByCatererId(2L);
        List<Dish> dishList = dishes.get();
        return dishList.stream().map(dishDtoConverter).collect(Collectors.toList());
    }

    @Override
    public List<DishDto> findAllDishes() {
        Iterable<Dish> dishes = dishRepository.findAll();
        List<Dish> dishList = new ArrayList<>();
        for(Dish d : dishes) {
            dishList.add(d);
        }
        return dishList.stream().map(dishDtoConverter).collect(Collectors.toList());
    }
}
