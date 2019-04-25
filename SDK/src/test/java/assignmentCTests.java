import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sdk.serialization.model.SubmissionResult;
import serialization.sdk.assignmentC;
import serialization.sdk.solutionC;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentCTests {

    private assignmentC solution;

    @BeforeEach
    public void before() {
        solution = new solutionC();
    }

    @Test
    public void passesCTest() {
        assertEquals(SubmissionResult.CORRECT, solution.solutionC());
    }
}
