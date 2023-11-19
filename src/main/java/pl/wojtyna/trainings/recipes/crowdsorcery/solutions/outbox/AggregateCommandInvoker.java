package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox;

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
            // TODO: try to answer following questions
            // 1. What happens if publish fails?
            // 2. What happens if there's a random delay between repository.save and events.publish?
            // 3. What happens if there's a crash between repository.save and events.publish?
            events.publish(eventPublisher);
        });
    }
}
