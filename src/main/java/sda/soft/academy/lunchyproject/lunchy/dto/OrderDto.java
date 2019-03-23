package sda.soft.academy.lunchyproject.lunchy.dto;

import sda.soft.academy.lunchyproject.lunchy.entities.Transaction;
import sda.soft.academy.lunchyproject.lunchy.entities.User;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDto {

    private Long id;
    private Long userId;
    private Long catererId;
    private List<OrderItemDto> dishDtoList;
    private LocalDateTime orderDate;
    private Long transactionId;

    public OrderDto() {
    }


    public OrderDto(Long id, Long userId,  LocalDateTime orderDate) {
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCatererId() {
        return catererId;
    }

    public void setCatererId(Long catererId) {
        this.catererId = catererId;
    }

    public List<OrderItemDto> getDishDtoList() {
        return dishDtoList;
    }

    public void setDishDtoList(List<OrderItemDto> dishDtoList) {
        this.dishDtoList = dishDtoList;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
}
