package pl.wojtyna.trainings.recipes.order;

public interface Discount {

    TotalCost apply(OrderSnapshot orderSnapshot);

    Discount combineWithMultiplicatively(Discount other);

    default boolean canBeCombinedWith(Discount other, CombinationRules rules) {
        return rules.canBeCombined(this, other);
    }
}
