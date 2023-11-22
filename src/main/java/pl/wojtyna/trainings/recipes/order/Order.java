package pl.wojtyna.trainings.recipes.order;

import org.jmolecules.ddd.annotation.AggregateRoot;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

@AggregateRoot
public class Order {

    private LineItems items;
    private boolean flagOne;
    private boolean flatTwo;
    private boolean flagThree;
    private boolean flagFour;

    public TotalCost totalCost(Discount discount) {
        Money base = items.stream().map(LineItem::unitPrice).reduce(UnitPrice::plus)
                          .orElse(Money.zero(CurrencyUnit.USD));
        return discount.apply(createSnapshot(base));
    }

    public void add() {
        // invariants
        throw new UnsupportedOperationException("Implement this method");
    }

    public void remove() {
        // invariants
        throw new UnsupportedOperationException("Implement this method");
    }

    private OrderSnapshot createSnapshot(Money base) {
        return null;
    }
}
