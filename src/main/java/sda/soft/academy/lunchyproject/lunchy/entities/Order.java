package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne //na ten moment, dla ułatwienia, zakładam że użytkownik możę dokonać tylko jednego zamówienia dziennie
    @JoinColumn(name = "users_id")
    private User user;

    @OneToMany (mappedBy = "order")
    private List<OrderItem> dishList;
//  zamówienie jest składane przez jedną osobę, ale ta osoba może zamówić więcej niż jedno danie, bo np. jest JUBY.
//  ponadto, osoba może zamówić dla kolegi, który akurat nie może zmienić zamówienia.
//  wciąż wybiera się dania tylko z jednego menu, ale tych dań może być wiele.
//  w zamóieniu tworzy się listę dań, których może być wiele. W tym przypadku sytuacja one to many, bo każde zamówienie jest osobne.
//  dlatego nie potrzeba mapowania w encji DISH, bo to jest jednostronna relacja w tym założeniu

    private LocalDateTime orderDate;

    @OneToOne
    @JoinColumn(name = "transactions_id")
    private Transaction transaction;
//  wychodzę z założenia, że nie można złożyć samego zamówienia, które nie jest dodane do żadnej transakcji.
//  użytkownik najpierw będzie musiałw wybrać transakcję, więc jej ID będzie już dostępny i dopiero po tym będzie mógł
//  stworzyć swoje zamówienie, które natychmiast zostanie dodane do wcześniej wybranej transakcji.

    @ManyToOne
    @JoinColumn(name = "caterers_id")
    private Caterer catererId;

    public Order() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getDishList() {
        return dishList;
    }

    public void setDishList(List<OrderItem> dishList) {
        this.dishList = dishList;
    }

    public Caterer getCatererId() {
        return catererId;
    }

    public void setCatererId(Caterer catererId) {
        this.catererId = catererId;
    }
}
