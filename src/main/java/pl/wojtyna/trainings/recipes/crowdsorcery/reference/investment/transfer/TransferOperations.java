package pl.wojtyna.trainings.recipes.crowdsorcery.reference.investment.transfer;

import org.jmolecules.architecture.hexagonal.SecondaryPort;
import org.joda.money.Money;

@SecondaryPort
public interface TransferOperations {

    void transfer(Account from, Account to, Money amount);
}
