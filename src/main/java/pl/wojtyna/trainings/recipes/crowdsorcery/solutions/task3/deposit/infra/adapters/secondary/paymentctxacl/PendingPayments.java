package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.infra.adapters.secondary.paymentctxacl;

import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.payment.api.PaymentToken;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.Deposit;

public interface PendingPayments {

    void add(PaymentToken paymentToken, Deposit deposit);

    PaymentToken getPaymentToken(Deposit deposit);
}
