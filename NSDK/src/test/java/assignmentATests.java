import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serialization.nsdk.SubmissionResult;
import serialization.nsdk.AssignmentA;
import serialization.nsdk.SolutionA;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentATests {

    private AssignmentA solution;
    private SubmissionResult submissionResult;

    @BeforeEach
    public void before() {
        solution = new SolutionA();
        submissionResult = new SubmissionResult(true, "");
    }

    @Test
    public void passesA1Test() {
        assertEquals(submissionResult, solution.solutionA1());
    }

    @Test
    public void passesA2Test() {
        assertEquals(submissionResult, solution.solutionA2());
    }

    @Test
    public void passesA3Test() {
        assertEquals(submissionResult, solution.solutionA3());
    }
}
