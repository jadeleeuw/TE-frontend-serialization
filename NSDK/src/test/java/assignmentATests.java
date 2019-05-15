import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serialization.nsdk.SubmissionResult;
import serialization.nsdk.AssignmentA;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentATests {

    private AssignmentA assignment;
    private SubmissionResult submissionResult;

    @BeforeEach
    public void before() {
        assignment = new AssignmentA();
        submissionResult = new SubmissionResult(true, "");
    }

    @Test
    public void passesA1Test() {
        assertEquals(submissionResult, assignment.solutionA1());
    }

    @Test
    public void passesA2Test() {
        assertEquals(submissionResult, assignment.solutionA2());
    }

    @Test
    public void passesA3Test() {
        assertEquals(submissionResult, assignment.solutionA3());
    }
}
