//package sda.soft.academy.lunchyproject.lunchy.entities;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "menus")
//public class Menu {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToMany
//    private List<Dish> listOfDishes;
////  jedno menu może posiadać wiele dań.
//
//    @OneToOne
//    private Caterer catererId;
////  każdy dostawca posiada tylko jedno menu. To określa do jakiego dostawcy należy dane menu.
//
//    public Menu() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public List<Dish> getListOfDishes() {
//        return listOfDishes;
//    }
//
//    public void setListOfDishes(List<Dish> listOfDishes) {
//        this.listOfDishes = listOfDishes;
//    }
//
//    public Caterer getCatererId() {
//        return catererId;
//    }
//
//    public void setCatererId(Caterer catererId) {
//        this.catererId = catererId;
//    }
//}
//
