package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker.deposit;

import java.util.Optional;
import java.util.UUID;

public class NoOpDepositRepo implements DepositRepo {

    @Override
    public Optional<Deposit> load(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public void save(Deposit deposit) {

    }
}
