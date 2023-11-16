package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.fundraising;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.investment.invest.Investor;

public class FundraisingSystem {

    public ByFunction<Investor, BasedOnFunction<ProjectForm, DomainEvents>> startFundraising() {
        return investor -> projectForm -> DomainEvents.of(new ProjectFundraisingStarted(investor, projectForm));
    }

    @FunctionalInterface
    public interface ByFunction<S, R> {

        R by(S s);
    }

    @FunctionalInterface
    public interface BasedOnFunction<S, R> {

        R basedOn(S s);
    }
}
