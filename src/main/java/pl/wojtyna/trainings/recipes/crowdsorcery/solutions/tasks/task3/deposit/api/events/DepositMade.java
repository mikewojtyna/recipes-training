package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.deposit.api.events;

import org.jmolecules.ddd.annotation.ValueObject;
import pl.wojtyna.trainings.recipes.common.integration.PublicEvent;

import java.math.BigDecimal;

@ValueObject
public record DepositMade(String accountId, BigDecimal amount, String currency) implements PublicEvent {
}
