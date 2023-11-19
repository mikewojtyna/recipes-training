package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.fundraising;

import pl.wojtyna.trainings.recipes.common.domain.DomainEventPublisher;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.investment.InvestmentMade;

public class InvestmentMadeEventHandler {

    private final FundraisingRepo fundraisingRepo;
    private final DomainEventPublisher domainEventPublisher;

    public InvestmentMadeEventHandler(FundraisingRepo fundraisingRepo, DomainEventPublisher domainEventPublisher) {
        this.fundraisingRepo = fundraisingRepo;
        this.domainEventPublisher = domainEventPublisher;
    }

    public void handle(InvestmentMade event) {
        fundraisingRepo.findByProjectId(event.projectId()).ifPresent(fundraising -> {
            var domainEvents = DomainEvents.empty();
            if (fundraising.noInvestmentsMadeSoFar()) {
                fundraising.start();
                domainEvents = domainEvents.following(new FundraisingStarted());
            }
            if (fundraising.isFunded()) {
                fundraising.close();
                domainEvents = domainEvents.following(new FundraisingClosed(event.projectId()));
            }
            fundraisingRepo.save(fundraising);
            domainEvents.publish(domainEventPublisher);
        });
    }
}
