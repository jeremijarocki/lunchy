package sda.soft.academy.lunchyproject.lunchy.dto;

import sda.soft.academy.lunchyproject.lunchy.entities.Order;
import sda.soft.academy.lunchyproject.lunchy.entities.User;

import java.util.List;

public class TransactionDto {

    private Long id;
    private Long catererId;
    private List<TransactionItemDto> orderList;
    private String transactionStatus;
    private String additionalComments;
    private Long companyId;
    private Long userId;

    public TransactionDto() {
    }

    public TransactionDto(Long id, Long catererId, String transactionStatus, String additionalComments, Long companyId, Long userId) {
        this.id = id;
        this.catererId = catererId;
        this.transactionStatus = transactionStatus;
        this.companyId = companyId;
        this.userId = userId;
        this.additionalComments = additionalComments;
    }

    public TransactionDto(Long id, Long catererId, List<TransactionItemDto> orderList, String transactionStatus,
                          String additionalComments, Long companyId, Long userId) {
        this.id = id;
        this.catererId = catererId;
        this.orderList = orderList;
        this.transactionStatus = transactionStatus;
        this.companyId = companyId;
        this.userId = userId;
        this.additionalComments = additionalComments;
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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }
}
