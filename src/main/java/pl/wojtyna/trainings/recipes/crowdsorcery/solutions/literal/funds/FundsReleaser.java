package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.funds;

import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.fundraising.FundraisingClosed;

import java.util.UUID;

public class FundsReleaser {

    public void releaseFunds(UUID project) {
        throw new UnsupportedOperationException("Implement this method");
    }

    public void handle(FundraisingClosed fundraisingClosed) {
        releaseFunds(fundraisingClosed.project());
    }
}
