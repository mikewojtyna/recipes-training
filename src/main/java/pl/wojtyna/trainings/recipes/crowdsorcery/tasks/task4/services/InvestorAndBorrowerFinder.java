package pl.wojtyna.trainings.recipes.crowdsorcery.tasks.task4.services;

import pl.wojtyna.trainings.recipes.crowdsorcery.tasks.task4.domain.Borrower;
import pl.wojtyna.trainings.recipes.crowdsorcery.tasks.task4.domain.Investor;

public class InvestorAndBorrowerFinder {

    private final InvestorsRegistry investorsRegistry = InvestorsRegistry.create();
    private final BorrowersRegistry borrowersRegistry = BorrowersRegistry.create();

    public Investor findByName(String name) {
        return investorsRegistry.getInvestors().stream().filter(investor -> investor.name().equals(name)).findAny()
                                .orElseThrow();
    }

    public Borrower findBorrowerByName(String name) {
        return borrowersRegistry.getBorrowers().stream().filter(borrower -> borrower.name().equals(name)).findAny()
                                .orElseThrow();
    }
}
