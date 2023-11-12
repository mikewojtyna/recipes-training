package pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account;

import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain.DomainEvent;

public record DepositConfirmed(Deposit deposit) implements DomainEvent {}
