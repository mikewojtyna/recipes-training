package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.deposit.domain.account;

import org.jmolecules.ddd.annotation.ValueObject;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;

@ValueObject
public record DepositMade() implements DomainEvent {
}
