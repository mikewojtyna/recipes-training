package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task1;

import java.util.List;

public interface BorrowersRegistry {

    void register(Borrower borrower);

    void unregister(Borrower borrower);

    List<Borrower> getBorrowers();
}