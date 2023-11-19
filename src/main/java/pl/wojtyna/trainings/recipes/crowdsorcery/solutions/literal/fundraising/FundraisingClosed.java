package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.fundraising;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.common.domain.DomainEvents;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.project.Project;

import java.util.UUID;

public record FundraisingClosed(UUID project) implements DomainEvent {}
