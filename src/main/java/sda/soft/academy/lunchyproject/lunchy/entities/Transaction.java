package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TRANSACTION_1")
public class Transaction {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Order> orders;

    @Enumerated (value = EnumType.STRING)
    private TransactionStatus transactionStatus;

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Order> getOrderList() {
        return orders;
    }

    public void setOrderList(List<Order> orderList) {
        this.orders = orderList;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}

