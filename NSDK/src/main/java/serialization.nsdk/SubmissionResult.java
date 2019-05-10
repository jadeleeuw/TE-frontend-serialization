package serialization.nsdk;

import java.util.Objects;

public class SubmissionResult {

    private boolean correct;
    private String reason;

    public SubmissionResult() {}

    public SubmissionResult(boolean correct, String reason) {
        this.correct = correct;
        this.reason = reason;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "SubmissionResult{" +
                "correct=" + correct +
                ", reason='" + reason + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubmissionResult that = (SubmissionResult) o;
        return correct == that.correct &&
                Objects.equals(reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correct, reason);
    }
}
