package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.jupiter.api.Test;
import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.deposit.Deposit;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.deposit.DepositRepo;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.deposit.MakeDepositUseCase;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.deposit.NoOpDepositRepo;

import java.util.UUID;

class DepositCommandInvokerExamplesTest {

    @Test
    void example() {
        DepositRepo repo = new NoOpDepositRepo();
        DomainEventPublisher eventPublisher = new NoOpDomainEventPublisher();
        AggregateCommandInvoker<Deposit, UUID> depositCommandInvoker = new AggregateCommandInvoker<>(repo,
                                                                                                     eventPublisher);
        var makeDepositUseCase = new MakeDepositUseCase(depositCommandInvoker);
        makeDepositUseCase.execute(Money.of(CurrencyUnit.USD, 100), UUID.randomUUID());
    }
}