package sda.soft.academy.lunchyproject.lunchy.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.soft.academy.lunchyproject.lunchy.dto.UserDto;
import sda.soft.academy.lunchyproject.lunchy.services.UserService;

import javax.validation.Valid;
import java.util.Locale;

@Controller
//@RequestMapping(name = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MessageSource messageSource;

    @Value("${lunchy.server.address}")
    private String lunchyServerAddress;

    @GetMapping("/user/register")
    public String register(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "user/registerUser";
    }

    @PostMapping("/user/register")
    public String registerUser(Model model,
                               @Valid @ModelAttribute(name = "user") UserDto userDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("user", userDto);
            return "user/registerUser";
        } else {
            userService.register(userDto);

            String messageRegistrationSuccess = messageSource.getMessage("user.registration.success.message",
                    new Object[] {userDto.getLogin(), userDto.getEmail()}, Locale.getDefault());

            return "redirect:/message?msg=" + messageRegistrationSuccess;
        }
    }

    @GetMapping(name = "/user/login")
    public String loginUser(Model model) {
        return "user/userLogin";
    }

    @PostMapping("/user/loginAction")
    public String logUser(Model model,
                          @ModelAttribute(name = "login") String login,
                          @ModelAttribute(name = "password") String password) {
        boolean logged = userService.login(login, password);
        if (logged) {
            String messageLoginSuccess = messageSource.getMessage("user.logged.info.success",
                    new Object[] {login}, Locale.getDefault());
            return "redirect:/message?msg= " + messageLoginSuccess;
        } else {
            String messageLoginSuccess = messageSource.getMessage("user.logged.info.failure",
                    new Object[] {login}, Locale.getDefault());
            return "redirect:/message?msg= " + messageLoginSuccess;
        }
    }

}
