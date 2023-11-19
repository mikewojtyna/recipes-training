package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;

import java.util.Optional;

public class BrokerDelegatingDomainEventPublisher implements DomainEventPublisher {

    private final EventsBroker eventsBroker;
    private final AggregateRepository<AggregateRoot<?>, ?> aggregateRepository;

    public BrokerDelegatingDomainEventPublisher(EventsBroker eventsBroker,
                                                AggregateRepository<AggregateRoot<?>, ?> aggregateRepository) {
        this.eventsBroker = eventsBroker;
        this.aggregateRepository = aggregateRepository;
    }

    @Override
    public void publish(DomainEvents events) {
        eventsBroker.enqueue(events);
        findAssociatedAggregate(events).ifPresent(aggregate -> {
            aggregate.markEventsAsCommitted();
            aggregateRepository.save(aggregate);
        });
    }

    @Override
    public void publish(DomainEvent event) {
        publish(DomainEvents.of(event));
    }

    private Optional<AggregateRoot<?>> findAssociatedAggregate(DomainEvents events) {
        // some magical way of finding associated aggregate
        return Optional.empty();
    }
}
