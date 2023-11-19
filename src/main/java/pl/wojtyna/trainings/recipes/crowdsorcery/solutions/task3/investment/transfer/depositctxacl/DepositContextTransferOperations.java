package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.investment.transfer.depositctxacl;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.investment.transfer.Account;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.api.usecases.LocalTransferUseCase;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.AccountId;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.investment.transfer.TransferOperations;

import java.util.UUID;

public class DepositContextTransferOperations implements TransferOperations {

    private final LocalTransferUseCase transferUseCase;

    public DepositContextTransferOperations(LocalTransferUseCase localTransferUseCase) {this.transferUseCase = localTransferUseCase;}

    @Override
    public void transfer(Account from, Account to, Money amount) {
        transferUseCase.transfer(translate(from), translate(to), amount);
    }

    private AccountId translate(Account account) {
        return new AccountId(UUID.fromString(account.id()));
    }
}
