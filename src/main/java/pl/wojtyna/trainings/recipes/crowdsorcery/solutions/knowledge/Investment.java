package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.knowledge;

import org.joda.money.Money;

public record Investment(Project project, Investor investor, Money amount, AllowedInvestments allowedInvestments) {

    public Investment {
        if (!allowedInvestments.isValid(investor, project)) {
            throw new IllegalArgumentException("Investor " + investor + " is not allowed to invest in project " + project);
        }
    }
}
