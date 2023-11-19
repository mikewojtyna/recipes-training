package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.deposit;

import org.joda.money.Money;

public class Deposit {

    public boolean lock(Money money) {
        return true;
    }

    public void unlock(Money money) {
        throw new UnsupportedOperationException();
    }
}
