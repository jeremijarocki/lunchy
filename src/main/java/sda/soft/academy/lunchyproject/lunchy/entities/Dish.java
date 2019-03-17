package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Dish {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "caterer_id")
    private Long catererId;

    private String name;
    private BigDecimal price;

    @Enumerated (value = EnumType.STRING)
    private DishType dishType;

    public Dish() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCetererId() {
        return catererId;
    }

    public void setCetererId(Long cetererId) {
        this.catererId = cetererId;
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
}
