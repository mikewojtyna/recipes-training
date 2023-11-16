package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.api.usecases;

import org.jmolecules.architecture.hexagonal.PrimaryPort;
import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.AccountId;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.AccountRepository;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.Deposit;

@PrimaryPort
public class MakeDepositUseCase {

    private final AccountRepository accountRepository;
    private final DomainEventPublisher eventPublisher;

    public MakeDepositUseCase(AccountRepository accountRepository, DomainEventPublisher eventPublisher) {
        this.accountRepository = accountRepository;
        this.eventPublisher = eventPublisher;
    }

    public void makeDeposit(AccountId accountId, Deposit deposit) {
        accountRepository.load(accountId).ifPresent(account -> {
            var events = account.make(deposit);
            accountRepository.save(account);
            eventPublisher.publish(events);
        });
    }
}
