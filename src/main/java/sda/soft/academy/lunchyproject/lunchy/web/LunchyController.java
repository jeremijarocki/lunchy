package sda.soft.academy.lunchyproject.lunchy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sda.soft.academy.lunchyproject.lunchy.dto.CatererDto;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
import sda.soft.academy.lunchyproject.lunchy.dto.TransactionDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;
import sda.soft.academy.lunchyproject.lunchy.repository.CatererRepository;
import sda.soft.academy.lunchyproject.lunchy.repository.DishRepository;
import sda.soft.academy.lunchyproject.lunchy.services.CatererServiceImpl;
import sda.soft.academy.lunchyproject.lunchy.services.DishServiceImpl;
import sda.soft.academy.lunchyproject.lunchy.services.TransactionServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Controller
public class LunchyController {

    @Autowired
    private DishRepository dishRepository;

    @Autowired
    private CatererRepository catererRepository;

    @Autowired
    private Function<Dish, DishDto> dishDtoConverter;

    @Autowired
    private DishServiceImpl dishServiceImpl;

    @Autowired
    private CatererServiceImpl catererServiceImpl;

    @Autowired
    private TransactionServiceImpl transactionServiceImpl;

    @GetMapping("/home")
    public String mainPage() {
        return "home";
    }

    @GetMapping("/list")
    public String listPage(Model model) {
        List<DishDto> dishDtoList = dishServiceImpl.findAllDishes();
        model.addAttribute("dishes", dishDtoList);
        return "dishList";
    }

    @GetMapping("/list/{id}")
    public String listFromSingleCaterer(@PathVariable Long id, Model model) {
        Optional<Caterer> caterer = catererRepository.findById(id);
        if(caterer.isPresent()) {
            model.addAttribute("caterer", caterer.get());
            List<DishDto> dishList = dishServiceImpl.findDishes(caterer.get());
            model.addAttribute("dishes", dishList);
        } else {
            model.addAttribute("errorMsg", "There is no such caterer with id = " + id);
        }
        return "dishCatererList";
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

    @GetMapping("/caterer/list")
    public String showAllCaterers(Model model) {
        List<CatererDto> catererDtos = catererServiceImpl.findAllCaterers();
        model.addAttribute("caterers", catererDtos);
        return "catererList";
    }

    @GetMapping("/transaction/list")
    public String showAllTransactions (Model model) {
        List<TransactionDto> transactionDtos = transactionServiceImpl.findAllTransactions();
        model.addAttribute("transactions", transactionDtos);
        return "transactionList";
    }
}
