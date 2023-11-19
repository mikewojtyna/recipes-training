package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.correctivepolicies;

import org.springframework.scheduling.annotation.Scheduled;

public class LockedDepositsChecker {

    @Daily
    public void checkForLockedDepositsAndActAccordingToOurPolicies() {
        throw new UnsupportedOperationException("Implement this method");
    }
}
