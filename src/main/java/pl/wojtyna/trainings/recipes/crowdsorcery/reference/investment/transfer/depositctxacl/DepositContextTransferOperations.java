package pl.wojtyna.trainings.recipes.crowdsorcery.reference.investment.transfer.depositctxacl;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.api.usecases.TransferUseCase;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account.AccountId;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.investment.transfer.Account;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.investment.transfer.TransferOperations;

import java.util.UUID;

public class DepositContextTransferOperations implements TransferOperations {

    private final TransferUseCase transferUseCase;

    public DepositContextTransferOperations(TransferUseCase transferUseCase) {this.transferUseCase = transferUseCase;}

    @Override
    public void transfer(Account from, Account to, Money amount) {
        transferUseCase.transfer(translate(from), translate(to), amount);
    }

    private AccountId translate(Account account) {
        return new AccountId(UUID.fromString(account.id()));
    }
}
