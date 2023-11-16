package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.investment.invest;

import java.util.Optional;

public interface Strategies {

    Optional<Strategy> activeStrategyOf(InvestorId investorId);

    void set(Strategy strategy);
}
