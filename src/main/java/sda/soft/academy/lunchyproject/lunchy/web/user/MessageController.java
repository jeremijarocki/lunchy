package sda.soft.academy.lunchyproject.lunchy.web.user;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    @GetMapping(name = "/message")
    public String registeredMessage(@RequestParam String msg, Model model, Authentication authentication) {

        model.addAttribute("login", authentication.getName());
        model.addAttribute("msg", msg);
        return "user/registeredUser";

    }

}
