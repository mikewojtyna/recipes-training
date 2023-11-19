package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;

import java.util.function.Function;

@FunctionalInterface
public interface AggregateCommand<A> extends Function<A, DomainEvents> {}
