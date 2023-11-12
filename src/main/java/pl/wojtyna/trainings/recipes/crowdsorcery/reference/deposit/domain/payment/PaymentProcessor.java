package pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.payment;

import org.jmolecules.architecture.hexagonal.SecondaryPort;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account.Deposit;

@SecondaryPort
public interface PaymentProcessor {

    void process(Deposit deposit);
}
