package pl.wojtyna.trainings.recipes.crowdsorcery.problems.literal.project;

public class Project {

    private Fundraising fundraising;
    private Investments investments;

    public void invest(Investor investor, Investment investment) {
        if (investor.deposit().isLessThan(investment.amount())) {
            throw new IllegalArgumentException("Investor does not have enough money");
        }
        investor.reduceBalanceBy(investment.amount());
        investments.add(investment);
        if(investments.noInvestmentWasMadeSoFar()) {
            fundraising.start();
        }
    }
}
