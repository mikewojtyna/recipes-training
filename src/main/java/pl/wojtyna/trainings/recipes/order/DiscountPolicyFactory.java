package pl.wojtyna.trainings.recipes.order;

public interface DiscountPolicyFactory {

    Discount chooseBestDiscountPolicy();
}
