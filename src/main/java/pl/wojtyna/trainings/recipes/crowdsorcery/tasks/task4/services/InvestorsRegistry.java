package pl.wojtyna.trainings.recipes.crowdsorcery.tasks.task4.services;

import pl.wojtyna.trainings.recipes.crowdsorcery.tasks.task4.domain.Investor;

import java.util.List;
import java.util.SequencedCollection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public class InvestorsRegistry {

    private static volatile InvestorsRegistry instance;
    private final ConcurrentLinkedQueue<Investor> investors;

    private InvestorsRegistry() {
        this.investors = loadInitialDataFromSomeVerySlowDatabase();
    }

    public static InvestorsRegistry create() {
        if (instance != null) {
            return instance;
        }
        else {
            synchronized (InvestorsRegistry.class) {
                if (instance == null) {
                    instance = new InvestorsRegistry();
                }
                return instance;
            }
        }
    }

    public void register(Investor investor) {
        investors.add(investor);
    }

    public void unregister(Investor investor) {
        investors.remove(investor);
    }

    public SequencedCollection<Investor> getInvestors() {
        return List.copyOf(investors);
    }

    private ConcurrentLinkedQueue<Investor> loadInitialDataFromSomeVerySlowDatabase() {
        try {
            TimeUnit.SECONDS.sleep(1);
            return new ConcurrentLinkedQueue<>();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
