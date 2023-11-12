package pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.payment;

import pl.wojtyna.trainings.recipes.crowdsorcery.reference.common.domain.DomainEvent;
import pl.wojtyna.trainings.recipes.crowdsorcery.reference.deposit.domain.account.Deposit;

public record PaymentVerified(Deposit deposit) implements DomainEvent {
}
