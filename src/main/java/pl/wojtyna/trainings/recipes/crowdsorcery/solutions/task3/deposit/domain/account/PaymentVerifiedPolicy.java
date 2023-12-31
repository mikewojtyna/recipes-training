package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account;

import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.common.domain.DomainPolicy;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.payment.PaymentVerified;

public class PaymentVerifiedPolicy implements DomainPolicy {

    private final AccountRepository accountRepository;
    private final DomainEventPublisher eventPublisher;

    public PaymentVerifiedPolicy(AccountRepository accountRepository, DomainEventPublisher eventPublisher) {
        this.accountRepository = accountRepository;
        this.eventPublisher = eventPublisher;
    }

    public void handle(PaymentVerified paymentVerified) {
        accountRepository.load(paymentVerified.deposit().accountId()).ifPresent(account -> {
            var events = account.confirm(paymentVerified.deposit());
            accountRepository.save(account);
            eventPublisher.publish(events);
        });
    }
}
