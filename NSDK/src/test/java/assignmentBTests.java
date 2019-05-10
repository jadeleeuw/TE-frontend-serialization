import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serialization.nsdk.SubmissionResult;
import serialization.nsdk.AssignmentB;
import serialization.nsdk.SolutionB;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentBTests {

    private AssignmentB solution;
    private SubmissionResult submissionResult;

    @BeforeEach
    public void before() {
        solution = new SolutionB();
        submissionResult = new SubmissionResult(true, "");
    }

    @Test
    public void passesBTest() {
        assertEquals(submissionResult, solution.solutionB());
    }
}
