package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;

public abstract class BaseAggregateRoot<ID> implements AggregateRoot<ID> {

    private DomainEvents uncommittedEvents;

    public BaseAggregateRoot() {
        uncommittedEvents = DomainEvents.empty();
    }

    @Override
    public void markEventsAsCommitted() {
        uncommittedEvents = DomainEvents.empty();
    }

    @Override
    public DomainEvents uncommittedEvents() {
        return uncommittedEvents;
    }

    protected void enqueue(DomainEvent event) {
        uncommittedEvents = uncommittedEvents.following(event);
    }

    protected void enqueue(DomainEvents events) {
        events.stream().forEach(this::enqueue);
    }
}
