package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.deposit.domain.account;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;

public record WithdrawalMade(Money amount) implements DomainEvent {
}
