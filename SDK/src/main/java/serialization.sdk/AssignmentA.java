package serialization.sdk;

import sdk.serialization.ApiClient;
import sdk.serialization.api.AssignmentAApi;
import sdk.serialization.api.WarehouseApi;
import sdk.serialization.api.WebstoreApi;
import sdk.serialization.model.*;

public class AssignmentA implements SolutionA {

    private AssignmentAApi assignmentAPI;
    private WarehouseApi warehouseAPI;
    private WebstoreApi webstoreAPI;

    // Enter your identification key here
    private final int ID_KEY = ;

    public AssignmentA() {
        ApiClient client =  new ApiClient();
        client.setApiKey(String.valueOf(ID_KEY));
        this.assignmentAPI = new AssignmentAApi(client);
        this.warehouseAPI = new WarehouseApi(client);
        this.webstoreAPI = new WebstoreApi(client);
    }

    // Implement assignment A1 here
    @Override
    public SubmissionResult solutionA1() {
       return null;
    }

    // Implement assignment A2 here
    @Override
    public SubmissionResult solutionA2() {
        return null;
    }

    // Implement assignment A3 here
    @Override
    public SubmissionResult solutionA3() {
        return null;
    }
}
