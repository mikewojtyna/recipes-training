package pl.wojtyna.trainings.recipes.crowdsorcery.reference.investment.api.usecases;

import org.jmolecules.architecture.hexagonal.PrimaryPort;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.investment.invest.Strategies;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.investment.invest.Strategy;

@PrimaryPort
public class SetInvestmentStrategyUseCase {

    private final Strategies strategies;

    public SetInvestmentStrategyUseCase(Strategies strategies) {
        this.strategies = strategies;
    }

    public void setInvestmentStrategy(Strategy strategy) {
        strategies.set(strategy);
    }
}
