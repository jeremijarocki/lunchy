package sda.soft.academy.lunchyproject.lunchy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//exclude ozancza wylaczenie Spring Security Auto Configuration, aby nie pytalo o zalogowanie za kazdym razem
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class LunchyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LunchyApplication.class, args);
    }

}
