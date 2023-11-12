package pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.infra.adapters.secondary.repository;

import org.jmolecules.architecture.hexagonal.SecondaryAdapter;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account.AccountId;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account.AccountRepository;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account.DepositAccount;

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
