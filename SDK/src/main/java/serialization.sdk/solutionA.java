package serialization.sdk;

import sdk.serialization.ApiClient;
import sdk.serialization.api.AssignmentAApi;
import sdk.serialization.model.SubmissionResult;

public class solutionA implements assignmentA {

    private AssignmentAApi api;

    // Enter your identification key here
    private final int ID_KEY = ;

    public solutionA() {
        ApiClient client =  new ApiClient();
        client.setApiKey(String.valueOf(ID_KEY));
        this.api = new AssignmentAApi(client);
    }

    // Implement assignment A1 here
    @Override
    public SubmissionResult solutionA1() {

    }

    // Implement assignment A2 here
    @Override
    public SubmissionResult solutionA2() {

    }

    // Implement assignment A3 here
    @Override
    public SubmissionResult solutionA3() {

    }
}
