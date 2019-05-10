import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serialization.nsdk.SubmissionResult;
import serialization.nsdk.AssignmentC;
import serialization.nsdk.SolutionC;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentCTests {

    private AssignmentC solution;
    private SubmissionResult submissionResult;

    @BeforeEach
    public void before() {
        solution = new SolutionC();
        submissionResult = new SubmissionResult(true, "");
    }

    @Test
    public void passesCTest() {
        assertEquals(submissionResult, solution.solutionC());
    }
}
