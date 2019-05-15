import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serialization.nsdk.SubmissionResult;
import serialization.nsdk.AssignmentC;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentCTests {

    private AssignmentC assignment;
    private SubmissionResult submissionResult;

    @BeforeEach
    public void before() {
        assignment = new AssignmentC();
        submissionResult = new SubmissionResult(true, "");
    }

    @Test
    public void passesCTest() {
        assertEquals(submissionResult, assignment.solutionC());
    }
}
