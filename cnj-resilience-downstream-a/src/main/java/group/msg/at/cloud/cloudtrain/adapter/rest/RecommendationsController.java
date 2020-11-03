package group.msg.at.cloud.cloudtrain.adapter.rest;

import group.msg.at.cloud.cloudtrain.core.boundary.RecommendationEngine;
import group.msg.at.cloud.cloudtrain.core.entity.RecommendedItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/recommendations")
@CrossOrigin
public class RecommendationsController {

    @Autowired
    RecommendationEngine boundary;

    @GetMapping("{userId}")
    public ResponseEntity<List<RecommendedItem>> getRecommendations(
            @PathVariable(name = "userId") String userId
    ) {
        return ResponseEntity.ok(boundary.calculateRecommendations(userId));
    }
}
