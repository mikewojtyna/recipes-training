package pl.wojtyna.trainings.recipes.crowdsorcery.problems.knowledge;

import org.joda.money.Money;

public class InvestService {

    public void invest(Project project, Investor investor, Money amount) {
        var investment = new Investment(project, investor, amount);
        if (investment.project().name().contains("AI") && investorIsNotTechnical(investor)) {
            throw new RuntimeException("Cannot invest");
        }
        else if (someOtherCondition()) {

        }
        else if (yetAnotherCondition()) {

        }
        // ...
    }

    private boolean yetAnotherCondition() {
        return false;
    }

    private boolean someOtherCondition() {
        return false;
    }

    private boolean investorIsNotTechnical(Investor investor) {
        return false;
    }
}
