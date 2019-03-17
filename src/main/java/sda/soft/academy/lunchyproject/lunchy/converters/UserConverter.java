package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.UserDto;
import sda.soft.academy.lunchyproject.lunchy.entities.User;

import java.util.function.Function;

@Component
public class UserConverter implements Function<UserDto, User> {

    @Override
    public User apply(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setLogin(userDto.getLogin());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setAddress(userDto.getAddress());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());

        return user;

    }
}
