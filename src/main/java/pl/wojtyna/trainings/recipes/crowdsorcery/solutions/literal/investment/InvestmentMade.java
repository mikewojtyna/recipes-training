package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.investment;

import pl.wojtyna.trainings.recipes.common.domain.DomainEvent;

import java.util.UUID;

public record InvestmentMade(UUID projectId) implements DomainEvent {}
