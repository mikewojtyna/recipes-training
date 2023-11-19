package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;

public class NoOpEventsBroker implements EventsBroker {

    @Override
    public void enqueue(DomainEvents events) {
        // no-op
    }
}
