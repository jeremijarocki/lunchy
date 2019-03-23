package sda.soft.academy.lunchyproject.lunchy.asserts;

import org.junit.Assert;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;

public class DishDtoAssert {

    private DishDto dishDto;

    public DishDtoAssert(DishDto dishDto) {
        this.dishDto = dishDto;
    }

    public DishDtoAssert hasId(Long expectedId) {
        Assert.assertEquals(expectedId, dishDto.getId());
        return this;
    }

    public DishDtoAssert hasName(String expectedName) {
        Assert.assertEquals(expectedName, dishDto.getName());
        return this;
    }
}
