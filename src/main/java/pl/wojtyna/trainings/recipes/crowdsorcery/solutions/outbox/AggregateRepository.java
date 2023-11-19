package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.outbox;

import java.util.Optional;

public interface AggregateRepository<A extends AggregateRoot<ID>, ID> {

    Optional<A> load(ID id);

    void save(A aggregate);
}
