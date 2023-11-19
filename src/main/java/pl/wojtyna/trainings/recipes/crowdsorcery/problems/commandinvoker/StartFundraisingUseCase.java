package pl.wojtyna.trainings.recipes.crowdsorcery.problems.commandinvoker;

import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;

import java.util.UUID;

public class StartFundraisingUseCase {

    private final ProjectRepo projectRepo;
    private final DomainEventPublisher eventPublisher;

    public StartFundraisingUseCase(ProjectRepo projectRepo, DomainEventPublisher eventPublisher) {
        this.projectRepo = projectRepo;
        this.eventPublisher = eventPublisher;
    }

    public void execute(UUID projectId) {
        projectRepo.findById(projectId).ifPresent(it -> {
            var events = it.startFundraising();
            projectRepo.save(it);
            events.publish(eventPublisher);
        });
    }
}
