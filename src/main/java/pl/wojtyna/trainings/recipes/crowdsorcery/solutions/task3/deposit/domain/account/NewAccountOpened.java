package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;

public record NewAccountOpened(DepositAccount account) implements DomainEvent {
}
