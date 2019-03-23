package sda.soft.academy.lunchyproject.lunchy.dto;

import sda.soft.academy.lunchyproject.lunchy.entities.DishType;

import java.math.BigDecimal;

public class DishDto {

    private Long id;
    private String name;
    private BigDecimal price;
    private String dishType;

    public DishDto() {
    }

    public DishDto(Long id, String name, BigDecimal price, String dishType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dishType = dishType;
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

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }
}
