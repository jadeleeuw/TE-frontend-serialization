import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sdk.serialization.model.SubmissionResult;
import serialization.sdk.AssignmentB;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentBTests {

    private AssignmentB assignment;
    private SubmissionResult submissionResult;

    @BeforeEach
    public void before() {
        assignment = new AssignmentB();
        submissionResult = new SubmissionResult();
        submissionResult.setCorrect(true);
        submissionResult.setReason("");
    }

    @Test
    public void passesBTest() {
        assertEquals(submissionResult, assignment.solutionB());
    }

}
