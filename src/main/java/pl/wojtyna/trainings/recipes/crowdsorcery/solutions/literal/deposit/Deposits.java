package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.deposit;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.Investor;

public class Deposits {

    private final DepositRepo depositRepo;

    public Deposits(DepositRepo depositRepo) {this.depositRepo = depositRepo;}

    public boolean lock(Investor investor, Money money) {
        return depositRepo.find(investor.id()).map(deposit -> deposit.lock(money)).orElse(false);
    }

    public void unlock(Investor investor, Money money) {
        depositRepo.find(investor.id()).ifPresent(deposit -> deposit.unlock(money));
    }
}
