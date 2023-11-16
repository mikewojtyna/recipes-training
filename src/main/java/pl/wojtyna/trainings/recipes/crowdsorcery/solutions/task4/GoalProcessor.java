package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task4;

import org.joda.money.Money;

public class GoalProcessor implements ProposalProcessor {

    @Override
    public String process(Project proposal) {
        if (proposal.getGoal().isLessThan(Money.parse("USD 100000"))) {
            return "ACCEPTED";
        }
        return "REJECTED";
    }
}
