package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.project.*;

import java.util.UUID;

class ProjectCommandInvokerExamplesTest {

    private ProjectRepo repo;
    private DomainEventPublisher eventPublisher;
    private AggregateCommandInvoker<Project, UUID> projectCommandInvoker;

    @BeforeEach
    void setup() {
        repo = new NoOpProjectRepo();
        eventPublisher = new NoOpDomainEventPublisher();
        projectCommandInvoker = new AggregateCommandInvoker<>(repo,
                                                              eventPublisher);
    }

    @Test
    void investExample() {
        var investUseCase = new InvestUseCase(projectCommandInvoker);
        investUseCase.execute(UUID.randomUUID(), new Investor(), Money.of(CurrencyUnit.USD, 100));
    }

    @Test
    void startFundraisingExample() {
        var startFundraisingUseCase = new StartFundraisingUseCase(projectCommandInvoker);
        startFundraisingUseCase.execute(UUID.randomUUID());
    }
}