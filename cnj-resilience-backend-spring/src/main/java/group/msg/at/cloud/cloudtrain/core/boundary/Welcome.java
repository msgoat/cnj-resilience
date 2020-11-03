package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.core.control.RecommendationsCollector;
import group.msg.at.cloud.cloudtrain.core.control.WatchListCollector;
import group.msg.at.cloud.cloudtrain.core.entity.WelcomeItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Welcome {

    @Autowired
    RecommendationsCollector recommendationsCollector;

    @Autowired
    WatchListCollector watchListCollector;

    public WelcomeItems collectWelcomeItems(String userId) {
        WelcomeItems result = new WelcomeItems();
        recommendationsCollector.collect(result, userId);
        watchListCollector.collect(result, userId);
        return result;
    }
}
