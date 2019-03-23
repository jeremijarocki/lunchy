//package sda.soft.academy.lunchyproject.lunchy.converters;
//
//import org.springframework.stereotype.Component;

// ten converter chyba nie jest nam potrzebny. Kiedy będziemy wyciągać encję użytkowika z bazy i rzutować do obiektu?
// Co będziemy robić z takim obiektem?
// Pomimo tych wątpliwości zostawiam to tutaj.


//import sda.soft.academy.lunchyproject.lunchy.dto.UserDto;
//import sda.soft.academy.lunchyproject.lunchy.entities.User;
//
//import java.util.function.Function;
//
//@Component
//public class UserDtoConverter implements Function<User, UserDto> {
//
//    @Override
//    public UserDto apply(User user) {
//        UserDto userDto = new UserDto();
//        userDto.setLogin(user.getLogin());
//        userDto.setPassword(user.getPassword()); //czy to hasło nie jest zahashowane, gdy je wyciągamy z bazy?
//        userDto.setEmail(user.getEmail());
//        userDto.setAddress(user.getAddress());
//        userDto.setFirstName(user.getFirstName());
//        userDto.setLastName(user.getLastName());
//
//        return userDto;
//    }
//}
