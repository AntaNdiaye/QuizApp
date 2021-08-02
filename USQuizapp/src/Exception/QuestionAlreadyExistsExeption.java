package Exception;

public class QuestionAlreadyExistsExeption extends Exception {
        public QuestionAlreadyExistsExeption(Long questionId) {
        super("Question " + questionId + " already exist in database");
    }}
