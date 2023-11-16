package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task4;

public class InterestRateProcessor implements ProposalProcessor {

    private final double interestRate;

    public InterestRateProcessor(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String process(Project proposal) {
        if (proposal.getInterestRate() > interestRate) {
            return "VERIFICATION_REQUIRED";
        }
        return "NO_DECISION";
    }
}
