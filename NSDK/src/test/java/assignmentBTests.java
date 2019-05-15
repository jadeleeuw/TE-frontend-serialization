import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serialization.nsdk.SubmissionResult;
import serialization.nsdk.AssignmentB;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentBTests {

    private AssignmentB assignment;
    private SubmissionResult submissionResult;

    @BeforeEach
    public void before() {
        assignment = new AssignmentB();
        submissionResult = new SubmissionResult(true, "");
    }

    @Test
    public void passesBTest() {
        assertEquals(submissionResult, assignment.solutionB());
    }
}
