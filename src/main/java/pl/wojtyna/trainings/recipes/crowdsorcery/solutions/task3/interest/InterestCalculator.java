package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.interest;

import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.investment.Investments;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.niceobjects.Interests;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task1.InvestorId;

public class InterestCalculator {

    private final Investments investments;

    public InterestCalculator(Investments investments) {
        this.investments = investments;
    }

    public Interests calculate(InvestorId investorId) {
        List<Investment> list = investments.findByInvestorId(investorId);
        if(something()) {
            applyPlatformFeeOf(0.1);
        } else if()
            else if(tenant.is)
                return new Interests();
    }
}
