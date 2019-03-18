package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Menu menuId;
//  dane zamówienie jest skierowane tylko do jednego dostawcy. Dlatego relacja jest many to one, bo każdy dostawca posiada tylko jedno menu.
//  oczywiście można złożyć wiele zamówień do danego dostawcy tego samego dnia.

    @OneToMany
    private List<Dish> dishList;
//  zamówienie jest składane przez jedną osobę, ale ta osoba może zamówić więcej niż jedno danie, bo np. jest JUBY.
//  ponadto, osoba może zamówić dla kolegi, który akurat nie może zmienić zamówienia.
//  wciąż wybiera się dania tylko z jednego menu, ale tych dań może być wiele.
//  w zamóieniu tworzy się listę dań, których może być wiele. W tym przypadku sytuacja one to many, bo każde zamówienie jest osobne.
//  dlatego nie potrzeba mapowania w encji DISH, bo to jest jednostronna relacja w tym założeniu

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Menu getMenuId() {
        return menuId;
    }

    public void setMenuId(Menu menuId) {
        this.menuId = menuId;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }
}
