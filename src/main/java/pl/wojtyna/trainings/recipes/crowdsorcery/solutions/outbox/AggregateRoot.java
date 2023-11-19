package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;

public interface AggregateRoot<ID> {

    ID id();

    DomainEvents uncommittedEvents();

    void markEventsAsCommitted();
}
