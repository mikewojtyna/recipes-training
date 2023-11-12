package pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.infra.spring;

import org.springframework.context.ApplicationEventPublisher;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain.DomainEvents;

public class SpringEventPublisher implements DomainEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public SpringEventPublisher(ApplicationEventPublisher applicationEventPublisher) {this.applicationEventPublisher = applicationEventPublisher;}

    @Override
    public void publish(DomainEvents events) {
        events.stream().forEach(applicationEventPublisher::publishEvent);
    }

    @Override
    public void publish(DomainEvent event) {
        applicationEventPublisher.publishEvent(event);
    }
}
