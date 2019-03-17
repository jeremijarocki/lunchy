package sda.soft.academy.lunchyproject.lunchy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.soft.academy.lunchyproject.lunchy.entities.User;
import sda.soft.academy.lunchyproject.lunchy.entities.UserStatus;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//    Optional<User> findOneByLoginAndUserStatus(String login, UserStatus status);
//
//    Optional<User> findOneByLogin(String login);

    Optional<User> findOneByLoginAndPassword(String login, String password);

    Optional<User> findByLoginAndToken(String login, String token);
}