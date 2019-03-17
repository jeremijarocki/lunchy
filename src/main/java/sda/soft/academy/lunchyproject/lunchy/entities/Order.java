package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ORDER_TR")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Dish> dishList;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }
}
