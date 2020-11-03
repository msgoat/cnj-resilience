package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.adapter.rest.out.recommendations.RecommendationsClient;
import group.msg.at.cloud.cloudtrain.core.control.RecommendationsCollector;
import group.msg.at.cloud.cloudtrain.core.control.WatchListCollector;
import group.msg.at.cloud.cloudtrain.core.entity.WelcomeItems;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Simple {@code Boundary} that returns welcome messages.
 */
@Stateless
public class Welcome {

    @Inject
    RecommendationsCollector recommendationsCollector;

    @Inject
    WatchListCollector watchListCollector;

    public WelcomeItems collectWelcomeItems(String userId) {
        WelcomeItems result = new WelcomeItems();
        recommendationsCollector.collect(result, userId);
        watchListCollector.collect(result, userId);
        return result;
    }
}
