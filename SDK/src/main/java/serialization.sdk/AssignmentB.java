package serialization.sdk;

import sdk.serialization.ApiClient;
import sdk.serialization.api.AssignmentBApi;
import sdk.serialization.api.WarehouseApi;
import sdk.serialization.api.WebstoreApi;
import sdk.serialization.model.*;

public class AssignmentB implements SolutionB {

    private AssignmentBApi assignmentAPI;
    private WarehouseApi warehouseAPI;
    private WebstoreApi webstoreAPI;

    // Enter your identification key here
    private final int ID_KEY = ;

    public AssignmentB() {
        ApiClient client =  new ApiClient();
        client.setApiKey(String.valueOf(ID_KEY));
        this.assignmentAPI = new AssignmentBApi(client);
        this.warehouseAPI = new WarehouseApi(client);
        this.webstoreAPI = new WebstoreApi(client);
    }

    @Override
    public SubmissionResult solutionB() {
       return null;
    }
}
