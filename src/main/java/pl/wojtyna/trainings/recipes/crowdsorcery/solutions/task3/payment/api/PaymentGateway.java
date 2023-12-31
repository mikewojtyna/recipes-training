package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.payment.api;

import org.jmolecules.architecture.hexagonal.PrimaryPort;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.payment.paypal.PaypalProvider;

import java.util.concurrent.Flow;

@PrimaryPort
public interface PaymentGateway {

    PaymentToken pay(PaymentRequest paymentRequest);

    boolean isVerified(PaymentToken paymentToken);

    Flow.Publisher<PaymentEvent> events(PaymentToken token);

    static PaymentGateway defaultGateway() {
        return new PaypalProvider();
    }
}
