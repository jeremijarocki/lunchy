package sda.soft.academy.lunchyproject.lunchy.entities;

import org.hibernate.procedure.spi.ParameterRegistrationImplementor;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.*;
import java.util.List;

@Entity
public class Transaction {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany (fetch = FetchType.EAGER)
    private List<Order> orderList;

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
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
