package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task1;

import org.joda.money.Money;

public interface DepositService {

    void makeDeposit(Money money, InvestorId investorId);

    void withdraw(Money money, InvestorId investorId);
}
