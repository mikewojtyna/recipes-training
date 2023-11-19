package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.knowledge;

public interface AllowedInvestments {

    boolean isValid(Investor investor, Project project);
}
