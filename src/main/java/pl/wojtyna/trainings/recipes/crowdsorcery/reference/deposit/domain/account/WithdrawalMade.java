package pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain.DomainEvent;

public record WithdrawalMade(Money amount) implements DomainEvent {
}
