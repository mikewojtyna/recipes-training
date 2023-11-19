package pl.wojtyna.trainings.recipes.crowdsorcery.problems.commandinvoker;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;

import java.util.UUID;

public class Project {

    private final UUID id;

    public Project() {
        this.id = UUID.randomUUID();
    }

    public DomainEvents invest(Investor investor, Money money) {
        // do something
        return DomainEvents.empty();
    }

    public UUID id() {
        return id;
    }

    public DomainEvents startFundraising() {
        // do something
        return DomainEvents.empty();
    }
}
