package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.payment.paypal;

import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.payment.api.PaymentEvent;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.payment.api.PaymentGateway;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.payment.api.PaymentRequest;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.payment.api.PaymentToken;

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
