package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.project;

import org.joda.money.Money;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.AggregateCommandInvoker;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.Investor;

import java.util.UUID;

public class InvestUseCase {

    private final AggregateCommandInvoker<Project, UUID> commandInvoker;

    public InvestUseCase(AggregateCommandInvoker<Project, UUID> commandInvoker) {this.commandInvoker = commandInvoker;}

    public void execute(UUID projectId, Investor investor, Money money) {
        commandInvoker.invoke(projectId, project -> project.invest(investor, money));
    }
}
