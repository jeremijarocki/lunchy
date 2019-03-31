package sda.soft.academy.lunchyproject.lunchy.services;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.soft.academy.lunchyproject.lunchy.converters.CatererDtoConverter;
import sda.soft.academy.lunchyproject.lunchy.dto.CatererDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;
import sda.soft.academy.lunchyproject.lunchy.repository.CatererRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CatererServiceImpl implements CatererService {

    @Autowired
    private CatererRepository catererRepository;

    @Autowired
    private CatererDtoConverter catererDtoConverter;

    @Override
    public List<CatererDto> findAllCaterers() {
        Iterable<Caterer> caterers = catererRepository.findAll();
        List<Caterer> catererList = Lists.newArrayList(caterers);
        return catererList.stream().map(catererDtoConverter).collect(Collectors.toList());
    }
}
