package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.project;

import java.util.Optional;
import java.util.UUID;

public class NoOpProjectRepo implements ProjectRepo {

    @Override
    public Optional<Project> load(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public void save(Project aggregate) {

    }
}
