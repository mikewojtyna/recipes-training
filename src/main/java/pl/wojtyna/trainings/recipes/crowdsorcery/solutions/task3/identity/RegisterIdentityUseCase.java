package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task3.identity;

public interface RegisterIdentityUseCase {

    void registerIdentity(Identity identity);

    void unregisterIdentity(Identity identity);
}
