package Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

    private String answer_option;

    private  Boolean iscorect;

    private Question question;

    private Long answerId = question.getQuestion_id() ;

    public Answer(String answer_option, Boolean iscorrect) {
        this.answer_option = answer_option;
        this.iscorect = iscorrect;
    }

    public Answer() { }

    public String getAnswer_option() {
        return answer_option;
    }

    public void setAnswer_option(String answer_option) {
        this.answer_option = answer_option;
    }

    public Boolean getIscorrect() {
        return iscorect;
    }

    public void setIscorrect(Boolean iscorrect) {
        this.iscorect = iscorrect;
    }
    @Id
    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }
}

