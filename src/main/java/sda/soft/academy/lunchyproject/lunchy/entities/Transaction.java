package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.time.LocalDate;
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

    private LocalDate transactionDate;

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Caterer getCaterer() {
        return caterer;
    }

    public void setCaterer(Caterer caterer) {
        this.caterer = caterer;
    }

    public List<TransactionItem> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<TransactionItem> ordersList) {
        this.ordersList = ordersList;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
}

