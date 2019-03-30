package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.UserDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Company;
import sda.soft.academy.lunchyproject.lunchy.entities.User;
import sda.soft.academy.lunchyproject.lunchy.repository.CompanyRepository;

import java.util.Optional;
import java.util.function.Function;

@Component
public class UserConverter implements Function<UserDto, User> {

    @Autowired
    private CompanyRepository companyRepository;

//    zwykły konwerter obiektu Javy na encję bazy danych

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
        Optional<Company> company = companyRepository.findById(userDto.getCompanyId());
        if(company.isPresent()) {
            user.setCompanyId(company.get());
        }
        return user;
    }
}
