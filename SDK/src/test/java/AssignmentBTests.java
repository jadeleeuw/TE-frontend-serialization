import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sdk.serialization.model.SubmissionResult;
import serialization.sdk.AssignmentB;
import serialization.sdk.SolutionB;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentBTests {

    private AssignmentB solution;

    @BeforeEach
    public void before() {
        solution = new SolutionB();
    }

    @Test
    public void passesBTest() {
        assertEquals(SubmissionResult.CORRECT, solution.solutionB());
    }

}
