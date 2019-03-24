package sda.soft.academy.lunchyproject.lunchy.asserts;

import org.junit.Assert;
import sda.soft.academy.lunchyproject.lunchy.entities.Order;

public class OrderAssert {

    private Order order;

    public OrderAssert(Order order) {
        this.order = order;
    }

    public OrderAssert hasId(Long expectedId) {
        Assert.assertEquals(expectedId, order.getId());
        return this;
    }

    public OrderAssert hasUserLogin(String expectedLogin) {
        Assert.assertEquals(expectedLogin, order.getUser().getLogin());
        return this;
    }

    public OrderAssert hasDishes(int expectedDishes) {
        Assert.assertEquals(expectedDishes, (order.getDishList() != null) ? order.getDishList().size() : 0);
        return this;
    }
}


