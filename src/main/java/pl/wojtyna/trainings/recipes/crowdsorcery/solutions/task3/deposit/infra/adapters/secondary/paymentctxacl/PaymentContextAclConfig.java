package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.infra.adapters.secondary.paymentctxacl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.Deposit;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.payment.PaymentProcessor;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.payment.api.PaymentGateway;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.payment.api.PaymentToken;

@Configuration
public class PaymentContextAclConfig {

    @Bean
    public PaymentProcessor paymentProcessor(DomainEventPublisher eventPublisher) {
        return new PaymentGatewayBoundedContextIntegrationProcessor(PaymentGateway.defaultGateway(),
                                                                    new PendingPayments() {
                                                                        @Override
                                                                        public void add(PaymentToken paymentToken,
                                                                                        Deposit deposit) {

                                                                        }

                                                                        @Override
                                                                        public PaymentToken getPaymentToken(Deposit deposit) {
                                                                            return null;
                                                                        }
                                                                    }, eventPublisher);
    }
}
