package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.deposit.domain.payment;

import org.jmolecules.architecture.hexagonal.SecondaryPort;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.deposit.domain.account.Deposit;

@SecondaryPort
public interface PaymentProcessor {

    void process(Deposit deposit);
}
