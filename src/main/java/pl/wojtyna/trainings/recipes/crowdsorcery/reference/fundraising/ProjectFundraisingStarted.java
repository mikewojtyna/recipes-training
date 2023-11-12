package pl.wojtyna.trainings.recipes.crowdsorcery.reference.fundraising;

import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.investment.invest.Investor;

public record ProjectFundraisingStarted(Investor investor, ProjectForm projectForm) implements DomainEvent {

}
