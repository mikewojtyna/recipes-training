package pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account;

public record PendingDeposit(Deposit deposit) {

    public ConfirmedDeposit confirm() {
        return new ConfirmedDeposit(deposit);
    }

    public static PendingDeposit of(Deposit deposit) {
        return new PendingDeposit(deposit);
    }
}
