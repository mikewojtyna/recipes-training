package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task3.investment.invest;

import org.joda.money.Money;

public interface Strategy {

    InvestmentDecisions apply(Money of);
}
