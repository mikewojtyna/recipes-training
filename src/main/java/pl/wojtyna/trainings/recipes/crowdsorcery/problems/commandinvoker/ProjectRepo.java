package pl.wojtyna.trainings.recipes.crowdsorcery.problems.commandinvoker;

import java.util.Optional;
import java.util.UUID;

public interface ProjectRepo {

    Optional<Project> findById(UUID id);

    void save(Project project);
}
