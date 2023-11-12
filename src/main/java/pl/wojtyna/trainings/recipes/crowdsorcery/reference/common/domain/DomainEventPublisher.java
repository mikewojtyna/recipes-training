package pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain;

import org.jmolecules.architecture.hexagonal.SecondaryPort;

@SecondaryPort
public interface DomainEventPublisher {

    void publish(DomainEvents events);

    void publish(DomainEvent event);
}
