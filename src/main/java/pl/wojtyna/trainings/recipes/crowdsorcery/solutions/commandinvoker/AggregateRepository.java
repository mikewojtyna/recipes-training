package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker;

import java.util.Optional;

public interface AggregateRepository<A, ID> {

    Optional<A> load(ID id);

    void save(A aggregate);
}
