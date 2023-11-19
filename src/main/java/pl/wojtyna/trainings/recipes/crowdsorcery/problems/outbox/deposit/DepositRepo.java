package pl.wojtyna.trainings.recipes.crowdsorcery.problems.outbox.deposit;

import pl.wojtyna.trainings.recipes.crowdsorcery.problems.outbox.AggregateRepository;

import java.util.UUID;

public interface DepositRepo extends AggregateRepository<Deposit, UUID> {}
