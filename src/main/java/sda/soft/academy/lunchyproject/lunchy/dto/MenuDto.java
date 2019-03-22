package sda.soft.academy.lunchyproject.lunchy.dto;

import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;

import java.util.List;

public class MenuDto {

    private Long id;
    private List<Dish> listOfDishes;
    private Caterer catererId;

    public MenuDto() {
    }

    public MenuDto(Long id, List<Dish> listOfDishes, Caterer catererId) {
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

    public List<Dish> getListOfDishes() {
        return listOfDishes;
    }

    public void setListOfDishes(List<Dish> listOfDishes) {
        this.listOfDishes = listOfDishes;
    }

    public Caterer getCatererId() {
        return catererId;
    }

    public void setCatererId(Caterer catererId) {
        this.catererId = catererId;
    }
}
