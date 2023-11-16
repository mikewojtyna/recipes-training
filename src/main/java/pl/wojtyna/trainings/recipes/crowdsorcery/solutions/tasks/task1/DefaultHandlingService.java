package pl.wojtyna.trainings.recipes.crowdsorcery.solutions.tasks.task1;

public interface DefaultHandlingService {

    void markProjectAsDefaulted(ProjectId projectId);

    void recover(ProjectId projectId);

    void markProjectAsRecovered(ProjectId projectId);
}
