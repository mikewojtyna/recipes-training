package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;

public class NoOpDomainEventPublisher implements DomainEventPublisher {

    @Override
    public void publish(DomainEvents events) {

    }

    @Override
    public void publish(DomainEvent event) {

    }
}
