package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox.deposit;

import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox.AggregateRepository;

import java.util.UUID;

public interface DepositRepo extends AggregateRepository<Deposit, UUID> {}
