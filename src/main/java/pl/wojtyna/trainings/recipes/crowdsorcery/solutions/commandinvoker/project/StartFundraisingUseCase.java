package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.project;

import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.AggregateCommandInvoker;

import java.util.UUID;

public class StartFundraisingUseCase {

    AggregateCommandInvoker<Project, UUID> projectCommandInvoker;

    public StartFundraisingUseCase(AggregateCommandInvoker<Project, UUID> projectCommandInvoker) {
        this.projectCommandInvoker = projectCommandInvoker;
    }

    public void execute(UUID projectId) {
        projectCommandInvoker.invoke(projectId, Project::startFundraising);
    }
}
