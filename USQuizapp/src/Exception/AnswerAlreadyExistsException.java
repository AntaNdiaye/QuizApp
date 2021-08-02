package Exception;

public class AnswerAlreadyExistsException  extends Exception {
    public AnswerAlreadyExistsException(Long answer_id) {
        super("Answer " + answer_id + " already exist in database");
    }
}
