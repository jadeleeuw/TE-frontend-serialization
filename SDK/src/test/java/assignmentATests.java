import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sdk.serialization.model.SubmissionResult;
import serialization.sdk.solutionA;
import serialization.sdk.assignmentA;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentATests {

    private assignmentA solution;

    @BeforeEach
    public void before() {
        solution = new solutionA();
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
