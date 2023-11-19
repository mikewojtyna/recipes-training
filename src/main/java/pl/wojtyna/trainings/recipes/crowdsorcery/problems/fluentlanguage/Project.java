package pl.wojtyna.trainings.recipes.crowdsorcery.problems.fluentlanguage;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;

import java.time.LocalDate;

public class Project {

    public DomainEvents investInto(Investor investor, Money amount) {
        throw new UnsupportedOperationException("Implement this method");
    }

    public DomainEvents startFundraising(LocalDate start, LocalDate end, MilestonesNotifier milestonesNotifier, SuccessStrategy successStrategy) {
        throw new UnsupportedOperationException("Implement this method");
    }
}
