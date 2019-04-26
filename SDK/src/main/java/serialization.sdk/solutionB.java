package serialization.sdk;

import sdk.serialization.ApiClient;
import sdk.serialization.api.AssignmentBApi;
import sdk.serialization.model.SubmissionResult;

public class solutionB implements assignmentB {

    private AssignmentBApi api;

    // Enter your identification key here
    private final int ID_KEY = ;

    public solutionB() {
        ApiClient client =  new ApiClient();
        client.setApiKey(String.valueOf(ID_KEY));
        this.api = new AssignmentBApi(client);
    }

    @Override
    public SubmissionResult solutionB() {

    }
}
