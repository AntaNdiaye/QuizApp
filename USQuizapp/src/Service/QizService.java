package Service;

import Models.Answer;
import Models.Question;
import Models.Quiz;
import Models.User;
import Repository.QuestionRepo;
import Repository.QuizRepo;
import Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QizService {
    @Autowired
    QuizRepo quizRepo;
    Question question;
    Quiz quiz;
    User user;
    Answer answer;


    public void getquiz() {
        quizRepo.findAll();
    }

}

