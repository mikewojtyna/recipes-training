package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.layers;

import org.joda.money.Money;

import java.util.List;

public class AssetInvestments {

    private ProjectInvestments projectInvestments;

    public AssetInvestments(ProjectInvestments projectInvestments) {this.projectInvestments = projectInvestments;}

    void makeEqualInvestment(Asset asset, Money amount, Investor investor) {
        findAllMatchingProjects(asset).forEach(project -> projectInvestments.makeInvestment(project, amount, investor));
    }

    void makeInvestmentPrioritizingTop5Projects(Asset asset, Money amount, Priorities priorities, Investor investor) {
        findTop5ProjectsAccordingTo(priorities).forEach(project -> projectInvestments.makeInvestment(project, amount, investor));
    }

    private Iterable<Project> findTop5ProjectsAccordingTo(Priorities priorities) {
        return List.of();
    }

    private List<Project> findAllMatchingProjects(Asset asset) {
        return List.of();
    }
}
