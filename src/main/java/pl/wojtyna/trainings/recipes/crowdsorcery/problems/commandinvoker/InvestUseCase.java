package pl.wojtyna.trainings.recipes.crowdsorcery.problems.commandinvoker;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;

import java.util.UUID;

public class InvestUseCase {

    private final ProjectRepo projectRepo;
    private final DomainEventPublisher eventPublisher;

    public InvestUseCase(ProjectRepo projectRepo, DomainEventPublisher eventPublisher) {
        this.projectRepo = projectRepo;
        this.eventPublisher = eventPublisher;
    }

    public void execute(Investor investor, UUID projectId, Money amount) {
        projectRepo.findById(projectId).ifPresent(it -> {
            var events = it.invest(investor, amount);
            projectRepo.save(it);
            events.publish(eventPublisher);
        });
    }
}
