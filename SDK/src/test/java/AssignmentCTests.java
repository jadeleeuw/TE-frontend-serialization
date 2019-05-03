import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sdk.serialization.model.SubmissionResult;
import serialization.sdk.AssignmentC;
import serialization.sdk.SolutionC;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentCTests {

    private AssignmentC solution;

    @BeforeEach
    public void before() {
        solution = new SolutionC();
    }

    @Test
    public void passesCTest() {
        assertEquals(SubmissionResult.CORRECT, solution.solutionC());
    }
}
