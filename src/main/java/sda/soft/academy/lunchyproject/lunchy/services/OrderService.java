package sda.soft.academy.lunchyproject.lunchy.services;

import org.springframework.data.domain.jaxb.SpringDataJaxb;
import sda.soft.academy.lunchyproject.lunchy.dto.OrderDto;
import sda.soft.academy.lunchyproject.lunchy.exceptions.OrderNotFoundException;

public interface OrderService {

    void save (OrderDto orderDto);
    OrderDto findById (Long id) throws OrderNotFoundException;
    }



