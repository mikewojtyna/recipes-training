package pl.wojtyna.trainings.recipes.crowdsorcery.reference.payment.paypal;

import pl.wojtyna.trainings.recipes.crowdsorcery.reference.payment.api.PaymentEvent;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.payment.api.PaymentGateway;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.payment.api.PaymentRequest;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.payment.api.PaymentToken;

import java.util.concurrent.Flow;

public class PaypalProvider implements PaymentGateway {

    @Override
    public PaymentToken pay(PaymentRequest paymentRequest) {
        return null;
    }

    @Override
    public boolean isVerified(PaymentToken paymentToken) {
        return false;
    }

    @Override
    public Flow.Publisher<PaymentEvent> events(PaymentToken token) {
        return null;
    }
}
