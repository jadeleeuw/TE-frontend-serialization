import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serialization.nsdk.SubmissionResult;
import serialization.nsdk.AssignmentB;
import serialization.nsdk.SolutionB;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentBTests {

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
