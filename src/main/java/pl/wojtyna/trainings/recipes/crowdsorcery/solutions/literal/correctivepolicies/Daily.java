package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.literal.correctivepolicies;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;

@Scheduled(timeUnit = TimeUnit.DAYS, fixedDelay = 1)
public @interface Daily {
}
