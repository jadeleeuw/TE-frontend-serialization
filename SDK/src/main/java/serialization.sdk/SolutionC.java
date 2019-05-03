package serialization.sdk;

import sdk.serialization.ApiClient;
import sdk.serialization.api.AssignmentCApi;
import sdk.serialization.api.WarehouseApi;
import sdk.serialization.api.WebstoreApi;
import sdk.serialization.model.*;

public class SolutionC implements AssignmentC {

    private AssignmentCApi assignmentAPI;
    private WarehouseApi warehouseAPI;
    private WebstoreApi webstoreAPI;

    // Enter your identification key here
    private final int ID_KEY = ;

    public SolutionC() {
        ApiClient client =  new ApiClient();
        client.setApiKey(String.valueOf(ID_KEY));
        this.assignmentAPI = new AssignmentCApi(client);
        this.warehouseAPI = new WarehouseApi(client);
        this.webstoreAPI = new WebstoreApi(client);
    }

    @Override
    public SubmissionResult solutionC() {
        return null;
    }
}
