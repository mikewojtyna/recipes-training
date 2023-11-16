package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.investment.transfer;

import org.jmolecules.architecture.hexagonal.SecondaryPort;
import org.joda.money.Money;

@SecondaryPort
public interface TransferOperations {

    void transfer(Account from, Account to, Money amount);
}
