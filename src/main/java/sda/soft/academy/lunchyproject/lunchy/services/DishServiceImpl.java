package sda.soft.academy.lunchyproject.lunchy.services;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
//import sda.soft.academy.lunchyproject.lunchy.dao.DishDao;
//import sda.soft.academy.lunchyproject.lunchy.dao.DishDaoImpl;
import org.springframework.stereotype.Service;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;
import sda.soft.academy.lunchyproject.lunchy.repository.DishRepository;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class DishServiceImpl implements DishService {


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
    public List<DishDto> findDishes(Caterer catererId) {
        Optional<List<Dish>> dishes = dishRepository.findAllByCatererId(catererId);
        if(dishes.isPresent()) {
            List<Dish> dishList = dishes.get();
            return dishList.stream().map(dishDtoConverter).collect(Collectors.toList());
        } else {
            return null;
        }
    }

    @Override
    public List<DishDto> findAllDishes() {
        Iterable<Dish> dishes = dishRepository.findAll();
        List<Dish> dishList = Lists.newArrayList(dishes);
        return dishList.stream().map(dishDtoConverter).collect(Collectors.toList());
    }
}
