package pl.wojtyna.trainings.recipes.crowdsorcery.problems.outbox;

import java.util.Optional;

public interface AggregateRepository<A, ID> {

    Optional<A> load(ID id);

    void save(A aggregate);
}
