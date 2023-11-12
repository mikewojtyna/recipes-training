package pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.infra.adapters.secondary.paymentctxacl;

import pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account.Deposit;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.payment.api.PaymentToken;

public interface PendingPayments {

    void add(PaymentToken paymentToken, Deposit deposit);

    PaymentToken getPaymentToken(Deposit deposit);
}
