package sda.soft.academy.lunchyproject.lunchy.dto;

import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;

import java.util.List;

public class MenuDto {

    private Long id;
    private List<DishDto> listOfDishes;
    private Long catererId;

    public MenuDto() {
    }

    public MenuDto(Long id, Long catererId) {
        this.id = id;
        this.catererId = catererId;
    }

    public MenuDto(Long id, List<DishDto> listOfDishes, Long catererId) {
        this.id = id;
        this.listOfDishes = listOfDishes;
        this.catererId = catererId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<DishDto> getListOfDishes() {
        return listOfDishes;
    }

    public void setListOfDishes(List<DishDto> listOfDishes) {
        this.listOfDishes = listOfDishes;
    }

    public Long getCatererId() {
        return catererId;
    }

    public void setCatererId(Long catererId) {
        this.catererId = catererId;
    }
}
