package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.interest;

import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.niceobjects.Interests;

public class CalculateInterestsUseCase {

    private final InterestCalculator interestCalculator;

    public CalculateInterestsUseCase(InterestCalculator interestCalculator) {
        this.interestCalculator = interestCalculator;
    }

    public Interests calculate() {
        // load something
        // if load something else
        return interestCalculator.calculate();
    }
}
