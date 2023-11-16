package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task6.services;

import pl.wojtyna.trainings.recipes.crowdsorcery.solutions.task6.domain.Event;

public interface EventPublisher {

    void publish(Event event);
}
