package pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account;

import org.jmolecules.ddd.annotation.ValueObject;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain.DomainEvent;

@ValueObject
public record DepositInitiated(Deposit deposit) implements DomainEvent {
}
