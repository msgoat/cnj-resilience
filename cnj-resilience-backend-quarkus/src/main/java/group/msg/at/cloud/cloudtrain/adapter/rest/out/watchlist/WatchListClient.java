package group.msg.at.cloud.cloudtrain.adapter.rest.out.watchlist;

import group.msg.at.cloud.cloudtrain.core.entity.WatchedItem;
import group.msg.at.cloud.common.rest.tracing.TracingClientRequestFilter;
import group.msg.at.cloud.common.rest.tracing.TracingClientResponseFilter;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RegisterRestClient(configKey = "cloudtrain.services.watchlist")
@Path("api/v1/watchedItems")
public interface WatchListClient {

    @GET
    @Path("{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    List<WatchedItem> getWatchedItems(@PathParam("userId") String userId);
}
