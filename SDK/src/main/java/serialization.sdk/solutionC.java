package serialization.sdk;

import sdk.serialization.ApiClient;
import sdk.serialization.api.AssignmentCApi;
import sdk.serialization.model.SubmissionResult;

public class solutionC implements assignmentC {

    private AssignmentCApi api;

    // Enter your identification key here
    private final int ID_KEY = ;

    public solutionC() {
        ApiClient client =  new ApiClient();
        client.setApiKey(String.valueOf(ID_KEY));
        this.api = new AssignmentCApi(client);
    }

    @Override
    public SubmissionResult solutionC() {

    }
}
