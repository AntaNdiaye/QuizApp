package Service;

import Models.Answer;
import Repository.AnswerRepo;
import Exception.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AnswerService {

    @Autowired
    private AnswerRepo answerRepo;

    public AnswerService() {
    }
    public void add_answer(Answer newAnswer) throws AnswerAlreadyExistsException {
        if (answerRepo.existsById(newAnswer.getAnswerId())) {
            throw new UserAlreadyExistsException(newAnswer.getAnswerId());
        }
        answerRepo.save(newAnswer);
    }

    public List<Answer> getallAnswers(){
        return answerRepo.findAll();
    }

    public Answer searchAnswer(long answerId) throws AnnswerNotFoundException {
        if(answerRepo.existsById(answerId)){
            answerRepo.findById(answerId);
        }
        throw new AnnswerNotFoundException(answerId);
    }

    public Answer deleteAnswer(long answerId) throws AnnswerNotFoundException {
        if(answerRepo.existsById(answerId)){
            answerRepo.deleteById(answerId);
        }
        throw new AnnswerNotFoundException(answerId);
    }

}

