package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.payment;

import pl.wojtyna.trainings.recipes.common.domain.DomainPolicy;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.DepositInitiated;

public class DepositInitiatedPolicy implements DomainPolicy {

    private final PaymentProcessor paymentProcessor;

    public DepositInitiatedPolicy(PaymentProcessor paymentProcessor) {this.paymentProcessor = paymentProcessor;}

    public void when(DepositInitiated event) {
        paymentProcessor.process(event.deposit());
    }
}
