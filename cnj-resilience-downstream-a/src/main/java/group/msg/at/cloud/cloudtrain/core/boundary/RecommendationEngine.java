package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.core.entity.RecommendedItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecommendationEngine {

    public List<RecommendedItem> calculateRecommendations(String userId) {
        return new ArrayList<>();
    }
}
