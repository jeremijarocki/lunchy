package sda.soft.academy.lunchyproject.lunchy.services;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sda.soft.academy.lunchyproject.lunchy.converters.UserConverter;
import sda.soft.academy.lunchyproject.lunchy.dto.UserDto;
import sda.soft.academy.lunchyproject.lunchy.entities.User;
import sda.soft.academy.lunchyproject.lunchy.entities.UserStatus;
import sda.soft.academy.lunchyproject.lunchy.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class UserServieImpl implements UserService {

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private EmailService emailService;

    @Value("${lunchy.server.address}")
    private String orderServerAddress;

    @Override
    public void register(UserDto userDto) {
        User user = userConverter.apply(userDto);
        user.setUserStatus(UserStatus.REGISTERED);
        user.setInsertDate(LocalDateTime.now());
        user.setToken(UUID.randomUUID().toString());
        String encryptedPassword = DigestUtils.md5Hex(userDto.getPassword());
        user.setPassword(encryptedPassword);
        userRepository.save(user);
        String subject = messageSource.getMessage("user.registration.email.subject", new Object[]{}, Locale.getDefault());
        String userActivateAddress = orderServerAddress + "/user/activate?login=" + user.getLogin() + "&token=" + user.getToken();
        String body = messageSource.getMessage("user.registration.email.body", new Object[]{user.getLogin(), userActivateAddress},
                Locale.getDefault());
        emailService.send(subject, user.getEmail(), body);
    }

    @Override
    public boolean activate(String login, String token) {
        Optional<User> hasBeenActivatedOptional = userRepository.findByLoginAndToken(login, token);
        if (hasBeenActivatedOptional.isPresent()) {
            User user = hasBeenActivatedOptional.get();
            user.setUserStatus(UserStatus.ACTIVE);
            user.setUpdateDate(LocalDateTime.now());
            userRepository.save(user);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean login(String login, String password) {
        return true;

    }
}
