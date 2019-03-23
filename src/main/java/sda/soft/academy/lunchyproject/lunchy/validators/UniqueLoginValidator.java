package sda.soft.academy.lunchyproject.lunchy.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import sda.soft.academy.lunchyproject.lunchy.dto.UserDto;
import sda.soft.academy.lunchyproject.lunchy.entities.User;
import sda.soft.academy.lunchyproject.lunchy.repository.UserRepository;

import java.util.Optional;

@Component
public class UniqueLoginValidator implements Validator {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean supports(Class<?> aClass) {
        return UserDto.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors)
    {
        UserDto userDto = (UserDto) o;

        String login = userDto.getLogin();

        Optional<User> user = userRepository.findOneByLogin(login);

        if(user.isPresent()) {
            errors.rejectValue("login", "user.validation.login.loginAlreadyExists");
        }

    }
}
