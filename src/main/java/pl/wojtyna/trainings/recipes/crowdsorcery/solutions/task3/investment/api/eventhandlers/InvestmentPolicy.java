package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.investment.api.eventhandlers;

import org.jmolecules.architecture.hexagonal.PrimaryPort;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainPolicy;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.investment.invest.*;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.api.events.DepositMade;

@PrimaryPort
public class InvestmentPolicy implements DomainPolicy {

    private final Strategies strategies;
    private final InvestOperations investOperations;

    public InvestmentPolicy(Strategies strategies, InvestOperations investOperations) {
        this.strategies = strategies;
        this.investOperations = investOperations;
    }

    public void handle(DepositMade depositMade) {
        applyInvestmentStrategy(depositMade);
    }

    private void applyInvestmentStrategy(DepositMade depositMade) {
        strategies.activeStrategyOf(new InvestorId(depositMade.accountId())).ifPresent(strategy -> {
            var decisions = strategy.apply(Money.of(CurrencyUnit.of(depositMade.currency()), depositMade.amount()));
            investIntoDifferentAssetsBasedOn(decisions, findInvestor(depositMade));
        });
    }

    private Investor findInvestor(DepositMade depositMade) {
        throw new UnsupportedOperationException();
    }

    private void investIntoDifferentAssetsBasedOn(InvestmentDecisions decisions, Investor investor) {
        decisions.all().forEach(decision -> {
            investOperations.investInto(assetOf(decision)).some(amountOf(decision)).by(investor);
        });
    }

    private Money amountOf(InvestmentDecision decision) {
        throw new UnsupportedOperationException();
    }

    private Asset assetOf(InvestmentDecision investmentDecision) {
        throw new UnsupportedOperationException();
    }
}
