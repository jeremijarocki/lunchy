package sda.soft.academy.lunchyproject.lunchy.services;

import sda.soft.academy.lunchyproject.lunchy.dto.UserDto;

public interface UserService {

    void register(UserDto userDto);

    boolean activate(String login, String token);

    boolean login(String login, String password);

}
