package sda.soft.academy.lunchyproject.lunchy.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String password;

    private String email;

    private String address;

    private String firstName;

    private String lastName;

    private String token;

    private String userRole;

    private LocalDateTime insertDate;

    private LocalDateTime updateDate;


}
