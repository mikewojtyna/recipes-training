package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.fluentlanguage;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.fluentlanguage.FluentLanguage.AccordingToRulesDefinedBy;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.fluentlanguage.FluentLanguage.EndingAt;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.fluentlanguage.FluentLanguage.StartingAt;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.fluentlanguage.FluentLanguage.Using;

import java.time.LocalDate;

public class Project {

    public DomainEvents investInto(Investor investor, Money amount) {
        throw new UnsupportedOperationException("Implement this method");
    }

    public StartingAt<LocalDate, EndingAt<LocalDate, Using<MilestonesNotifier, AccordingToRulesDefinedBy<SuccessPolicy, DomainEvents>>>> startFundraising() {
        return startDate -> endDate -> milestonesNotifier -> successPolicy -> {
            // do some logic here
            return DomainEvents.empty();
        };
    }
}
