package sda.soft.academy.lunchyproject.lunchy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LunchyController {

    @GetMapping("/home")
    public String MainPage() {
        return "home";
    }

}
