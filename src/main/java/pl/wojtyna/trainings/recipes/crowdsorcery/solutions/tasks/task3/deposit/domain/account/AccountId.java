package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.deposit.domain.account;

import org.jmolecules.ddd.annotation.ValueObject;

import java.util.UUID;

@ValueObject
public record AccountId(UUID value) {
}
