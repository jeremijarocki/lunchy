package sda.soft.academy.lunchyproject.lunchy.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginDto {

    @NotNull
    @Size(min = 5)
    private String login;
    @NotNull
    private String password;

    public LoginDto() {
    }

    public LoginDto(@NotNull @Size(min = 5) String login, @NotNull String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
