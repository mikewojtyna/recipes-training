package pl.wojtyna.trainings.recipes.crowdsorcery.reference.investment.invest;

import org.joda.money.Money;

public interface Strategy {

    InvestmentDecisions apply(Money of);
}
