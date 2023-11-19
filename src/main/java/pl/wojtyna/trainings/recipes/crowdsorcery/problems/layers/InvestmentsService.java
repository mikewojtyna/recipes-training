package pl.wojtyna.trainings.recipes.crowdsorcery.problems.layers;

import org.joda.money.Money;

public interface InvestmentsService {

    void makeInvestment(Project project, Money amount, Investor investor);

    void makeEqualInvestment(Asset asset, Money amount, Investor investor);

    void makeInvestmentPrioritizingTop5Projects(Asset asset, Money amount, Priorities priorities, Investor investor);
}
