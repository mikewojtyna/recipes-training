package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.deposit;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.AggregateCommandInvoker;

import java.util.UUID;

public class MakeDepositUseCase {

    private final AggregateCommandInvoker<Deposit, UUID> commandInvoker;

    public MakeDepositUseCase(AggregateCommandInvoker<Deposit, UUID> commandInvoker) {this.commandInvoker = commandInvoker;}

    public void execute(Money amount, UUID investorId) {
        commandInvoker.invoke(investorId, deposit -> deposit.makeDeposit(amount));
    }
}
