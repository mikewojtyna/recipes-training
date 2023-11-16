package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account;

import org.jmolecules.ddd.annotation.ValueObject;
import org.joda.money.Money;

@ValueObject
public record Deposit(Money amount, AccountId accountId) {
}
