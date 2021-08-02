package Controller;

import Models.Question;
import Service.QuestionService;
import Exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }

    public QuestionService getQuestionService(){
        return questionService;
    }

    @PostMapping("/question")
    @ResponseStatus(HttpStatus.CREATED)
    public void createQuestion(@RequestBody Question newQuestion) throws QuestionAlreadyExistsExeption {
        questionService.add_question(newQuestion);
    }

    @GetMapping("/Question")
    public List<Question> getallQuestion(){
        return questionService.getallQuestion();
    }

    @GetMapping("/Question/{questionId}")
    public Question searchQuestion(@PathVariable long questionId) throws QuestionNotFoundException {
        return questionService.searchQuestion(questionId);
    }

    @DeleteMapping("/Question/{questionId}")
    public Question deleteQuestion(@PathVariable long questionId) {
        return questionService.deletequestion(questionId);
    }
}

