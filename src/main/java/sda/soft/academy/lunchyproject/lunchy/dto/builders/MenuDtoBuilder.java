//package sda.soft.academy.lunchyproject.lunchy.dto.builders;
//
//import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;
//import sda.soft.academy.lunchyproject.lunchy.dto.MenuDto;
//import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
//import sda.soft.academy.lunchyproject.lunchy.dto.OrderItemDto;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MenuDtoBuilder {
//
//    private Long id;
//    private List<DishDto> dishes;
//    private Long catererId;
//
//    public MenuDtoBuilder id(Long id) {
//        this.id = id;
//        return this;
//    }
//
//    public MenuDtoBuilder catererId(Long catererId) {
//        this.catererId = catererId;
//        return this;
//    }
//
//    public MenuDtoBuilder addMenuDish (List<Long> dishIds) {
//        if (dishes == null) {
//            dishes = new ArrayList<DishDto>();
//        }
//        for (Long id : dishIds) {
//            DishDto dishDto = new DishDto();
//            dishDto.setId(id);
//            dishes.add(dishDto);
//        }
//        return this;
//    }
//
//    public MenuDto build (){
//        MenuDto menuDto = new MenuDto(id, catererId);
//        menuDto.setListOfDishes(dishes);
//        return menuDto;
//    }
//}
//
