import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serialization.nsdk.SubmissionResult;
import serialization.nsdk.AssignmentC;
import serialization.nsdk.SolutionC;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentCTests {

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
