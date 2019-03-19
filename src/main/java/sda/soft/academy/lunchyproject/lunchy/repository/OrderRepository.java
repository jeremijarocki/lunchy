package sda.soft.academy.lunchyproject.lunchy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.soft.academy.lunchyproject.lunchy.entities.Order;

import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    @Override
    Optional findById(Long aLong);

    @Override
    Iterable findAll();
}
