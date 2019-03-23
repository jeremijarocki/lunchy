package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "caterer_id")
    private Caterer caterer;

    @OneToMany(mappedBy = "transaction")
    private List<TransactionItem> ordersList;
//  jedna transakcja może mieć wiele zamówień, ale każde zamówienie należy tylko do jednej transakcji
//  pytanie czy powinniśmy określić menuId lub catererId, by zdefiniować na sztywno dostawcę.
//  w aplikacji po wybraniu transakcji, od razu powinien zawężać się wybór dań tylko do jednego menu.

    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TransactionItem> getOrderList() {
        return ordersList;
    }

    public void setOrderList(List<TransactionItem> orderList) {
        this.ordersList = orderList;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Caterer getCaterer() {
        return caterer;
    }

    public void setCaterer(Caterer caterer) {
        this.caterer = caterer;
    }
}

