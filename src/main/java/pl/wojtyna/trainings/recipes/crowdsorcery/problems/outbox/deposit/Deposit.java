package pl.wojtyna.trainings.recipes.crowdsorcery.problems.outbox.deposit;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;
import pl.wojtyna.trainings.recipes.crowdsorcery.problems.outbox.AggregateRoot;

import java.util.UUID;

public class Deposit implements AggregateRoot<UUID> {

    private final UUID id;

    public Deposit(UUID id) {
        this.id = id;
    }

    public DomainEvents makeDeposit(Money money) {
        // do something
        return DomainEvents.empty();
    }

    @Override
    public UUID id() {
        return id;
    }
}
