package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.commandinvoker;

import java.util.Optional;

public interface AggregateRepository<A extends AggregateRoot<ID>, ID> {

    Optional<A> load(ID id);

    void save(A aggregate);
}
