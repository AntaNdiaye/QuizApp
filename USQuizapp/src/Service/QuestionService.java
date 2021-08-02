package Service;

import Models.Question;
import Models.Quiz;
import Models.User;
import Repository.QuestionRepo;
import Exception.*;
import Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class QuestionService {
    @Autowired
    private QuestionRepo questionRepo;

    public QuestionService() {
    }
    public void add_question(Question newquestion) throws QuestionAlreadyExistsExeption {
        if (questionRepo.existsById(newquestion.getQuestion_id())) {
            throw new UserAlreadyExistsException(newquestion.getQuestion_id());
        }
        questionRepo.save(newquestion);
    }

    public List<Question> getallQuestion(){
        return questionRepo.findAll();
    }

    public Question searchQuestion(long questionId) throws QuestionNotFoundException {
        if(questionRepo.existsById(questionId)){
            questionRepo.findById(questionId);
        }
        throw new QuestionNotFoundException(questionId);
    }

    public Question deletequestion(long questionId) {
        if(questionRepo.existsById(questionId)){
            questionRepo.deleteById(questionId);
        }
        throw new UserNotFoundException(questionId);
    }

}

