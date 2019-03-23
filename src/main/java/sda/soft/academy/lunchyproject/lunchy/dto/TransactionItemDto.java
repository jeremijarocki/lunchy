package sda.soft.academy.lunchyproject.lunchy.dto;

public class TransactionItemDto {

    private Long id;
    private Long orderId;

    public TransactionItemDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
