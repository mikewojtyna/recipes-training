package pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.api.events;

import org.jmolecules.ddd.annotation.ValueObject;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.integration.IntegrationEvent;

import java.math.BigDecimal;

@ValueObject
public record DepositMade(String accountId, BigDecimal amount, String currency) implements IntegrationEvent {
}
