package pl.wojtyna.trainings.recipes.crowdsorcery.problems.layers;

import org.joda.money.Money;

public interface ProjectInvestments {

    void makeInvestment(Project project, Money amount, Investor investor);
}
