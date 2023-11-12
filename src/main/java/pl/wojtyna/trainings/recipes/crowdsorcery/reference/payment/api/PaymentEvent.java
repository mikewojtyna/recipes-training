package pl.wojtyna.trainings.recipes.crowdsorcery.reference.payment.api;

import org.jmolecules.ddd.annotation.ValueObject;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.integration.IntegrationEvent;

@ValueObject
public record PaymentEvent() implements IntegrationEvent, DomainEvent {
}
