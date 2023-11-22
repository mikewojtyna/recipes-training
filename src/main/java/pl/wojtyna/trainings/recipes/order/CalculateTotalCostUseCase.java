package pl.wojtyna.trainings.recipes.order;

import java.util.Optional;

public class CalculateTotalCostUseCase {

    private final OrderRepository orderRepository;
    private final DiscountPolicyFactory discountPolicyFactory;

    public CalculateTotalCostUseCase(OrderRepository orderRepository, DiscountPolicyFactory discountPolicyFactory) {
        this.orderRepository = orderRepository;
        this.discountPolicyFactory = discountPolicyFactory;

    }

    public Optional<TotalCost> calculateTotalCost(OrderId orderId) {
        return orderRepository.load(orderId)
                              .map(order -> {
                                  Discount discount = discountPolicyFactory.chooseBestDiscountPolicy();
                                  order.calculateTotalCost(discount);
                                  return order;
                              });
    }
}
