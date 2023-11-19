package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.investment;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.deposit.Deposits;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.Investor;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.project.Project;

public class InvestOperations {

    private Deposits deposits;
    private DomainEventPublisher domainEventPublisher;
    private InvestmentsRepo investmentsRepo;

    public InvestOperations(Deposits deposits, DomainEventPublisher domainEventPublisher,
                            InvestmentsRepo investmentsRepo) {
        this.deposits = deposits;
        this.domainEventPublisher = domainEventPublisher;
        this.investmentsRepo = investmentsRepo;
    }

    public void investInto(Project project, Investor investor, Money amount) {
        deposits.lock(investor, amount);
        investmentsRepo.findByProjectId(project.id()).ifPresentOrElse(investments -> {
            investments.add(Investment.of(amount));
            investmentsRepo.save(investments);
            domainEventPublisher.publish(new InvestmentMade(project.id()));
        }, () -> deposits.unlock(investor, amount));
    }
}
