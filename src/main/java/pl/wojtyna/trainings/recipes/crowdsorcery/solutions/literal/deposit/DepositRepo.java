package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.deposit;

import java.util.Optional;
import java.util.UUID;

public interface DepositRepo {
    Optional<Deposit> find(UUID id);
}
