package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.payment;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.Deposit;

public record PaymentVerified(Deposit deposit) implements DomainEvent {
}
