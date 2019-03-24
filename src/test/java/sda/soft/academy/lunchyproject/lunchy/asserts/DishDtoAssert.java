package sda.soft.academy.lunchyproject.lunchy.asserts;

import org.junit.Assert;
import sda.soft.academy.lunchyproject.lunchy.dto.DishDto;

import java.math.BigDecimal;

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

    public DishDtoAssert hasPrice(BigDecimal expectedPrice) {
        Assert.assertEquals(expectedPrice, dishDto.getPrice());
        return this;
    }

    public DishDtoAssert hasDishType(String expectedDishType) {
        Assert.assertEquals(expectedDishType, dishDto.getDishType());
        return this;
    }

    public DishDtoAssert hasCatererId(Long expectedCatererId) {
        Assert.assertEquals(expectedCatererId, dishDto.getCatererId());
        return this;
    }
}
