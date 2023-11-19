package pl.wojtyna.trainings.recipes.crowdsorcery.problems.knowledge;

import org.joda.money.Money;

public record Investment(Project project, Investor investor, Money amount) {}
