package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "dishes")
public class Dish {

//    encja dań, zakładamy, że każde danie ma indywidualny numer i przynależy tylko do jednego menu.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private DishType dishType;

    @OneToOne
    @JoinColumn(name = "caterers_id")
    private Caterer catererId;

    public Dish() {
    }

    public Dish(Long id, String name, BigDecimal price, DishType dishType, Caterer catererId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dishType = dishType;
        this.catererId = catererId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }

    public Caterer getCatererId() {
        return catererId;
    }

    public void setCatererId(Caterer catererId) {
        this.catererId = catererId;
    }
}

