package sda.soft.academy.lunchyproject.lunchy.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CatererDto {

    private Long id;
    private String name;
    private String address;
    private String cuisine;
    private String telephone;
    private String email;

    public CatererDto() {
    }

    public CatererDto(Long id, String name, String address, String cuisine, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cuisine = cuisine;
        this.telephone = telephone;
        this.email = email;
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
}
