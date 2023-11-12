package pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.payment;

import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain.DomainPolicy;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account.DepositInitiated;

public class DepositInitiatedPolicy implements DomainPolicy {

    private final PaymentProcessor paymentProcessor;

    public DepositInitiatedPolicy(PaymentProcessor paymentProcessor) {this.paymentProcessor = paymentProcessor;}

    public void handle(DepositInitiated event) {
        paymentProcessor.process(event.deposit());
    }
}
