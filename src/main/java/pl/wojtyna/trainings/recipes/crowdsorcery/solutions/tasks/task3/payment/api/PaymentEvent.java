package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.payment.api;

import org.jmolecules.ddd.annotation.ValueObject;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.common.integration.PublicEvent;

@ValueObject
public record PaymentEvent() implements PublicEvent, DomainEvent {
}
