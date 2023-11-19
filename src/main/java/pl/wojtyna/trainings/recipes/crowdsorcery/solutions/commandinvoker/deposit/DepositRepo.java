package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.deposit;

import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.AggregateRepository;

import java.util.UUID;

public interface DepositRepo extends AggregateRepository<Deposit, UUID> {}
