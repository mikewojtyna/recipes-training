package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task4;

public class CreditScoreProcessor implements ProposalProcessor {

    @Override
    public String process(Project proposal) {
        if (proposal.getCreditScore() > 100) {
            return "ACCEPTED";
        }
        return "VERIFICATION_REQUIRED";
    }
}
