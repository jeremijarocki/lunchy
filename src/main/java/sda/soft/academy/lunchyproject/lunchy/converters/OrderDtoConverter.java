//package sda.soft.academy.lunchyproject.lunchy.converters;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
//import sda.soft.academy.lunchyproject.lunchy.dto.OrderItemDto;
//import sda.soft.academy.lunchyproject.lunchy.entities.Order;
//
//import java.util.List;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//@Component
//public class OrderDtoConverter implements Function<Order, OrderDto> {
//
//    @Autowired
//    private Order
//    @Override
//    public OrderDto apply(Order order) {
//        OrderDto orderDto = new OrderDto();
//        orderDto.setId(order.getId());
//        orderDto.setUserId(order.getUser().getId());
//        orderDto.setMenuId(order.getMenuId());
//        if (order.getDishList()!=null) {
//            List<OrderItemDto> items = order.getDishList().stream().map(orderItemDtoConverter).collect(Collectors.toList());
//            orderDto.setItems(items);
//        }
//
//    }
//}
