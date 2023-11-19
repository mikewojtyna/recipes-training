package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.fluentlanguage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Examples of fluent language applied to project investments")
class ProjectFluentLanguageExampleTest {

    @Test
    void example() {
        var project = new Project();
        var now = LocalDate.now();
        var domainEvents = project.startFundraising()
                                  .startingAt(now)
                                  .endingAt(now.plusMonths(1))
                                  .using(new DummyMilestonesNotifier())
                                  .accordingToRulesDefinedBy(new DummySuccessPolicy());
        assertThat(domainEvents.stream()).isEmpty();
    }
}