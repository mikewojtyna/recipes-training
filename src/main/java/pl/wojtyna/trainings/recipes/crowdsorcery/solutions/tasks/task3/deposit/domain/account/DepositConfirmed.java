package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.deposit.domain.account;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;

public record DepositConfirmed(Deposit deposit) implements DomainEvent {}
