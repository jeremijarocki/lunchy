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

    public OrderAssert hasCatererId(Long expectedCatererId) {
        Assert.assertEquals(expectedCatererId, order.getCatererId());
        return this;
    }

}
