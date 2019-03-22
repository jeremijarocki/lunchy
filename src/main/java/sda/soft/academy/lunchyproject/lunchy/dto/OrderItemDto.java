package sda.soft.academy.lunchyproject.lunchy.dto;

public class OrderItemDto {

    private Long id;
    private Long dishId;

    public OrderItemDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDishId() {
        return dishId;
    }

    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }
}
