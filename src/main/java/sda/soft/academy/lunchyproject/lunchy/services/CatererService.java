package sda.soft.academy.lunchyproject.lunchy.services;

import sda.soft.academy.lunchyproject.lunchy.dto.CatererDto;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;

import java.util.List;

public interface CatererService {

    List<CatererDto> findAllCaterers();
}
