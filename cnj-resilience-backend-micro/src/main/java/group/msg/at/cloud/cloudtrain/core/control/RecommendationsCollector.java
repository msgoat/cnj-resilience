package group.msg.at.cloud.cloudtrain.core.control;

import group.msg.at.cloud.cloudtrain.adapter.rest.out.recommendations.RecommendationsClient;
import group.msg.at.cloud.cloudtrain.adapter.rest.out.watchlist.WatchListClient;
import group.msg.at.cloud.cloudtrain.core.entity.RecommendedItem;
import group.msg.at.cloud.cloudtrain.core.entity.WelcomeItems;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class RecommendationsCollector {

    @Inject
    @RestClient
    RecommendationsClient client;

    public void collect(WelcomeItems target, String userId) {
        List<RecommendedItem> recommendations = client.getRecommendations(userId);
    }
}
