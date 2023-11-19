package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox.deposit;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox.BaseAggregateRoot;

import java.util.UUID;

public class Deposit extends BaseAggregateRoot<UUID> {

    private final UUID id;

    public Deposit(UUID id) {
        this.id = id;
    }

    public DomainEvents makeDeposit(Money money) {
        var newEvents = doSomething();
        enqueue(newEvents);
        return uncommittedEvents();
    }

    @Override
    public UUID id() {
        return id;
    }

    private DomainEvents doSomething() {
        return DomainEvents.empty();
    }
}
