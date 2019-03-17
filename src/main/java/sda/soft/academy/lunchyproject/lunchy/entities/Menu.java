package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "caterer_id")
    private Long catererId;

    @OneToMany (mappedBy = "transaction", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn (name = "dish_id")
    private List<Dish> listOfDishes;

    public Menu() {
    }

    public Long getCatererId() {
        return catererId;
    }

    public void setCatererId(Long catererId) {
        this.catererId = catererId;
    }

    public List<Dish> getListOfDishes() {
        return listOfDishes;
    }

    public void setListOfDishes(List<Dish> listOfDishes) {
        this.listOfDishes = listOfDishes;
    }
}
