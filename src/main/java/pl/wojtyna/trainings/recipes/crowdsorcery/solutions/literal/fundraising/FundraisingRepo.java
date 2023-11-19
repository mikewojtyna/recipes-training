package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.fundraising;

import java.util.Optional;
import java.util.UUID;

public interface FundraisingRepo {

    void save(Fundraising fundraising);

    Optional<Fundraising> findByProjectId(UUID uuid);
}
