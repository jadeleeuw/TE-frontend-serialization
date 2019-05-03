import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serialization.nsdk.SubmissionResult;
import serialization.nsdk.AssignmentA;
import serialization.nsdk.SolutionA;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentATests {

    private AssignmentA solution;

    @BeforeEach
    public void before() {
        solution = new SolutionA();
    }

    @Test
    public void passesA1Test() {
        assertEquals(SubmissionResult.CORRECT, solution.solutionA1());
    }

    @Test
    public void passesA2Test() {
        assertEquals(SubmissionResult.CORRECT, solution.solutionA2());
    }

    @Test
    public void passesA3Test() {
        assertEquals(SubmissionResult.CORRECT, solution.solutionA3());
    }
}
