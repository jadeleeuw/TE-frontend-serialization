import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sdk.serialization.model.SubmissionResult;
import serialization.sdk.assignmentB;
import serialization.sdk.solutionB;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class assignmentBTests {

    private assignmentB solution;

    @BeforeEach
    public void before() {
        solution = new solutionB();
    }

    @Test
    public void passesBTest() {
        assertEquals(SubmissionResult.CORRECT, solution.solutionB());
    }

}
