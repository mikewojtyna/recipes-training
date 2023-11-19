package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;

public interface EventsBroker {

    void enqueue(DomainEvents events);
}
