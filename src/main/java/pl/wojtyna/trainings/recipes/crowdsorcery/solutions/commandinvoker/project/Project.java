package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.project;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.AggregateRoot;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.Investor;

import java.util.UUID;

public class Project implements AggregateRoot<UUID> {

    private final UUID id;

    public Project(UUID id) {
        this.id = id;
    }

    public DomainEvents invest(Investor investor, Money money) {
        // do something
        return DomainEvents.empty();
    }

    @Override
    public UUID id() {
        return id;
    }

    public DomainEvents startFundraising() {
        // do something
        return DomainEvents.empty();
    }
}
