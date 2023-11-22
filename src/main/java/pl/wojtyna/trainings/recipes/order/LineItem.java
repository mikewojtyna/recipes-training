package pl.wojtyna.trainings.recipes.order;

import org.joda.money.Money;

public record LineItem(int quantity, Money unitPrice) {
}
