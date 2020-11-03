package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.core.entity.WatchedItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WatchedItemHistory {

    public List<WatchedItem> getWatchedItems(String userId) {
        return new ArrayList<>();
    }
}
