package sda.soft.academy.lunchyproject.lunchy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;

import java.util.List;
import java.util.Optional;

@Repository
public interface DishRepository extends CrudRepository<Dish, Long> {

    @Override
    Optional<Dish> findById(Long aLong);

    Optional<List<Dish>> findAllByCatererId(Long catererId);

    Optional<List<Dish>> findAllBy();
}
