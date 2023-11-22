package pl.wojtyna.trainings.recipes.order;

import org.joda.money.Money;

public record OrderSnapshot(Money base, LineItems items, OrderId orderId) {
}
