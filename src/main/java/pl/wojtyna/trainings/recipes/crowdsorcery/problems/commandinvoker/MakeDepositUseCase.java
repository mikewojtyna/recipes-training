package pl.wojtyna.trainings.recipes.crowdsorcery.problems.commandinvoker;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;

import java.util.UUID;

public class MakeDepositUseCase {

    private DepositRepo depositRepo;
    private DomainEventPublisher eventPublisher;

    public MakeDepositUseCase(DepositRepo depositRepo,
                              DomainEventPublisher eventPublisher) {
        this.depositRepo = depositRepo;
        this.eventPublisher = eventPublisher;
    }

    public void execute(Money amount, UUID investorId) {
        depositRepo.findById(investorId).ifPresent(it -> {
            var events = it.makeDeposit(amount);
            depositRepo.save(it);
            events.publish(eventPublisher);
        });
    }
}
