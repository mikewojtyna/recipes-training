package pl.wojtyna.trainings.recipes.crowdsorcery.tasks.task6.services;

import pl.wojtyna.trainings.recipes.crowdsorcery.tasks.task6.domain.Project;

public interface MarketingProcess {

    void beginCampaign(String campaignName, Project project);
}
