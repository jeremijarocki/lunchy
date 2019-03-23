package sda.soft.academy.lunchyproject.lunchy.web.user;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    @GetMapping("/message")
    public String addedUser(@RequestParam String msg, Model model) {
        model.addAttribute("message", msg);
        return "user/registeredUserMsg";
    }
}



