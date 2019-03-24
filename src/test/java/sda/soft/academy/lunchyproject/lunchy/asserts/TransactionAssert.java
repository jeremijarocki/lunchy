package sda.soft.academy.lunchyproject.lunchy.asserts;

import org.junit.Assert;
import sda.soft.academy.lunchyproject.lunchy.entities.Transaction;

import static org.junit.Assert.*;

public class TransactionAssert {

    private Transaction transaction;

    public TransactionAssert(Transaction transaction) {
        this.transaction = transaction;
    }

    public TransactionAssert hasId (Long expectedId) {
        Assert.assertEquals(expectedId, transaction.getId() );
        return this;
    }

    public TransactionAssert hasCatererId (Long expectedId) {
        Assert.assertEquals(expectedId, transaction.getCaterer().getId());
        return this;
    }

    //TODO trzeba jeszcze dorzucić sprwadzanie userID, jaki pracownik jest odpowiedzialny za tę transakcję.

    public TransactionAssert hasOrders (int expectedOrders) {
        Assert.assertEquals(expectedOrders, (transaction.getOrdersList() != null) ? transaction.getOrdersList().size() : 0);
        return this;
    }

}