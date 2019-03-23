package sda.soft.academy.lunchyproject.lunchy.dto;

import sda.soft.academy.lunchyproject.lunchy.entities.Order;

import java.util.List;

public class TransactionDto {

    private Long id;
    private Long catererId;
    private List<TransactionItemDto> orderList;
    private String transactionStatus;

    public TransactionDto() {
    }

    public TransactionDto(Long id, Long catererId, List<TransactionItemDto> orderList, String transactionStatus) {
        this.id = id;
        this.catererId = catererId;
        this.orderList = orderList;
        this.transactionStatus = transactionStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCatererId() {
        return catererId;
    }

    public void setCatererId(Long catererId) {
        this.catererId = catererId;
    }

    public List<TransactionItemDto> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<TransactionItemDto> orderList) {
        this.orderList = orderList;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
