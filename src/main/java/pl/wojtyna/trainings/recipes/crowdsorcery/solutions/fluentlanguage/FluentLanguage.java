package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.fluentlanguage;

import pl.wojtyna.trainings.recipes.common.domain.DomainPolicy;

import java.time.LocalDate;

public interface FluentLanguage {

    @FunctionalInterface
    interface StartingAt<S extends LocalDate, R> {
        R startingAt(S startDate);
    }

    @FunctionalInterface
    interface EndingAt<S extends LocalDate, R> {
        R endingAt(S endDate);
    }

    @FunctionalInterface
    interface Using<S, R> {
        R using(S source);
    }

    @FunctionalInterface
    interface AccordingToRulesDefinedBy<S extends DomainPolicy, R> {
        R accordingToRulesDefinedBy(S policy);
    }
}
