import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serialization.nsdk.SubmissionResult;
import serialization.nsdk.OptionalAssignmentC;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentCTests {

    private OptionalAssignmentC assignment;
    private SubmissionResult submissionResult;

    @BeforeEach
    public void before() {
        assignment = new OptionalAssignmentC();
        submissionResult = new SubmissionResult(true, "");
    }

    @Test
    public void passesCTest() {
        assertEquals(submissionResult, assignment.solutionC());
    }
}
