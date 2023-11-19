package pl.wojtyna.trainings.recipes.crowdsorcery.problems.commandinvoker;

import java.util.Optional;
import java.util.UUID;

public interface DepositRepo {

    Optional<Deposit> findById(UUID id);

    void save(Deposit project);
}
