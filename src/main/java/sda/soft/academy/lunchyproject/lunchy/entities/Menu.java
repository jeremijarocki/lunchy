package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Dish> listOfDishes;

    public Menu() {
    }

    public List<Dish> getListOfDishes() {
        return listOfDishes;
    }

    public void setListOfDishes(List<Dish> listOfDishes) {
        this.listOfDishes = listOfDishes;
    }
}

