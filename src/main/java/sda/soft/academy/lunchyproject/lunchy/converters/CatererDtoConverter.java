package sda.soft.academy.lunchyproject.lunchy.converters;

import org.springframework.stereotype.Component;
import sda.soft.academy.lunchyproject.lunchy.dto.CatererDto;
import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;

import java.util.function.Function;

@Component
public class CatererDtoConverter implements Function<Caterer, CatererDto> {
    @Override
    public CatererDto apply(Caterer caterer) {
        return new CatererDto(caterer.getId(), caterer.getName(), caterer.getAddress(), caterer.getCuisine(), caterer.getTelephone(), caterer.getEmail());
    }
}
