package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account;

import org.jmolecules.architecture.hexagonal.SecondaryPort;
import org.jmolecules.ddd.annotation.Repository;

import java.util.Optional;

@Repository
@SecondaryPort
public interface AccountRepository {

    Optional<DepositAccount> load(AccountId id);

    void save(DepositAccount account);
}
