package pl.wojtyna.trainings.recipes.order;

public class RegularDiscount implements Discount {

    @Override
    public TotalCost apply(OrderSnapshot orderSnapshot) {
        if(orderSnapshot.items().map().redice)
            // ...
            return TotalCost.of(...);
    }
}
