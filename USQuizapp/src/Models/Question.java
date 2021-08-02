package Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
    private String question;
    private Long question_id;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Id
    public Long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Long question_id) {
        this.question_id = question_id;
    }

}
