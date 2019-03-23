package sda.soft.academy.lunchyproject.lunchy.asserts;

import org.junit.Assert;
import sda.soft.academy.lunchyproject.lunchy.entities.Dish;

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
}
