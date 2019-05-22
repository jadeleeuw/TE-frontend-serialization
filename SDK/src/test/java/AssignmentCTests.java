import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sdk.serialization.model.SubmissionResult;
import serialization.sdk.OptionalAssignmentC;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentCTests {

    private OptionalAssignmentC assignment;
    private SubmissionResult submissionResult;

    @BeforeEach
    public void before() {
        assignment = new OptionalAssignmentC();
        submissionResult = new SubmissionResult();
        submissionResult.setCorrect(true);
        submissionResult.setReason("");
    }

    @Test
    public void passesCTest() {
        assertEquals(submissionResult, assignment.solutionC());
    }
}
