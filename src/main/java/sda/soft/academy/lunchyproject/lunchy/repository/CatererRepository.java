package sda.soft.academy.lunchyproject.lunchy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;

@Repository
public interface CatererRepository extends CrudRepository<Caterer, Long> {
}
