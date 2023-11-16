package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.api.usecases;

import org.jmolecules.architecture.hexagonal.PrimaryPort;
import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.AccountId;

@PrimaryPort
public class TransferUseCase {

    public void transfer(AccountId from, AccountId to, Money amount) {
        throw new UnsupportedOperationException("Implement this method");
    }
}
