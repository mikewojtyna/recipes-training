package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.investment;

import java.util.Optional;
import java.util.UUID;

public interface InvestmentsRepo {
    Optional<Investments> findByProjectId(UUID id);

    void save(Investments investments);
}
