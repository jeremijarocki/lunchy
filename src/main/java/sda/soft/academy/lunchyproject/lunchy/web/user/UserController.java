package sda.soft.academy.lunchyproject.lunchy.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.soft.academy.lunchyproject.lunchy.dto.UserDto;

@Controller
@RequestMapping(name = "/user")
public class UserController {

    @GetMapping("/register")
    public String registerUser(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "user/registerUser";
    }

}
