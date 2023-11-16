package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.fundraising;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.investment.invest.Investor;

public record ProjectFundraisingStarted(Investor investor, ProjectForm projectForm) implements DomainEvent {

}
