package sda.soft.academy.lunchyproject.lunchy.asserts;

import org.junit.Assert;
import sda.soft.academy.lunchyproject.lunchy.entities.Caterer;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;
import sda.soft.academy.lunchyproject.lunchy.entities.DishType;

import java.math.BigDecimal;

public class DishAssert {

    private Dish dish;

    public DishAssert(Dish dish) {
        this.dish = dish;
    }

    public DishAssert hasId(Long expectedId) {
        Assert.assertEquals(expectedId, dish.getId());
        return this;
    }

    public DishAssert hasName(String expectedName) {
        Assert.assertEquals(expectedName, dish.getName());
        return this;
    }

    public DishAssert hasPrice(BigDecimal expectedPrice) {
        Assert.assertEquals(expectedPrice, dish.getPrice());
        return this;
    }

    public DishAssert hasType(DishType expectedDishType) {
        Assert.assertEquals(expectedDishType, dish.getDishType());
        return this;
    }

    public DishAssert hasCaterer(Caterer expectedCaterer) {
        Assert.assertEquals(expectedCaterer, dish.getCatererId());
        return this;
    }
}
