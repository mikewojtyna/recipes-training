package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox;

import org.springframework.scheduling.annotation.Scheduled;
import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;

import java.util.concurrent.TimeUnit;

public class PollingDomainEventPublisher {

    private final DomainEventPublisher eventPublisher;

    public PollingDomainEventPublisher(DomainEventPublisher eventPublisher) {this.eventPublisher = eventPublisher;}

    @Scheduled(fixedRate = 1, timeUnit = TimeUnit.MINUTES)
    public void tryToPublishAllUncommittedEvents() {
        var events = findAllUncommittedEvents();
        eventPublisher.publish(events);
    }

    private DomainEvents findAllUncommittedEvents() {
        // e.g. SELECT * FROM events WHERE published = false
        return DomainEvents.empty();
    }
}
