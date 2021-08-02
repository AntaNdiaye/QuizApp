package Exception;

public class QuestionNotFoundException extends Throwable {
    public QuestionNotFoundException(Long questionId) {
        super("Question" + questionId + " not found");
    }
}
