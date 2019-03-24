package sda.soft.academy.lunchyproject.lunchy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;
import sda.soft.academy.lunchyproject.lunchy.repository.DishRepository;
import sda.soft.academy.lunchyproject.lunchy.services.DishService;
import sda.soft.academy.lunchyproject.lunchy.services.DishServiceImpl;

import javax.servlet.RequestDispatcher;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Controller
public class LunchyController {

    @Autowired
    private DishRepository dishRepository;

    @Autowired
    private Function<Dish, DishDto> dishDtoConverter;

    @GetMapping("/home")
    public String mainPage() {
        return "home";
    }

    //TODO
    //wsytrzyknac to
    private DishService dishService = new DishServiceImpl();

    //TODO
    //nie dziala!
    @GetMapping("/list")
    public String listPage(Model model) {
        List<DishDto> dishes = dishService.findAllDishes();
        model.addAttribute("dishes", dishes);
        return "dishList";
    }

    @GetMapping("/dish/{id}")
    public String showDish(@PathVariable Long id, Model model) {
        Optional<Dish> dish = dishRepository.findById(id);
        if (dish.isPresent()) {
            DishDto dishDto = dishDtoConverter.apply(dish.get());
            model.addAttribute("dishDto", dishDto);
        } else {
            model.addAttribute("errorMsg", "There is no such dish with id = " + id);
        }
        return "dish";
    }

}
