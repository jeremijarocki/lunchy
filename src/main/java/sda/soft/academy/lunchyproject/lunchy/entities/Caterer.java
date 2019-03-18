package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;

@Entity
@Table(name = "caterers")
public class Caterer {

//    encja dostawców.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String cuisine;
    private String telephone;
    private String email;

    @OneToOne
    private Menu menu;
//  każdy dostawca może mieć tylko jedno menu jednocześnie, jeśli chce coś zmienić, to musi je aktualizować.
//  dzięki temu unikamy problemu posiadania wielu menu, w tym starych i nieaktualnych.

    public Caterer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
