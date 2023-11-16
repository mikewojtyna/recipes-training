package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task6.services;

public interface MailNotifications {

    void sendMail(String to, String subject, String body);
}
