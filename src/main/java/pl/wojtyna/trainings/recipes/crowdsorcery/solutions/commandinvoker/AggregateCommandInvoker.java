package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker;

import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;

public class AggregateCommandInvoker<A extends AggregateRoot<ID>, ID> {

    private final AggregateRepository<A, ID> repository;
    private final DomainEventPublisher eventPublisher;

    public AggregateCommandInvoker(AggregateRepository<A, ID> repository, DomainEventPublisher eventPublisher) {
        this.repository = repository;
        this.eventPublisher = eventPublisher;
    }

    public void invoke(ID id, AggregateCommand<A> command) {
        repository.load(id).ifPresent(aggregate -> {
            var events = command.apply(aggregate);
            repository.save(aggregate);
            events.publish(eventPublisher);
        });
    }
}
