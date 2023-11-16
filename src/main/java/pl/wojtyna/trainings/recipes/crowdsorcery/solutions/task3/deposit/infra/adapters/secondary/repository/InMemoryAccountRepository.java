package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.infra.adapters.secondary.repository;

import org.jmolecules.architecture.hexagonal.SecondaryAdapter;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.AccountId;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.AccountRepository;
import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.deposit.domain.account.DepositAccount;

import java.util.Optional;

@SecondaryAdapter
public class InMemoryAccountRepository implements AccountRepository {

    @Override
    public Optional<DepositAccount> load(AccountId id) {
        return Optional.empty();
    }

    @Override
    public void save(DepositAccount account) {

    }
}
