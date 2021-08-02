package Controller;

import Models.Answer;
import Service.AnswerService;
import Exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AnswerController {
    private AnswerService answerService;

    public AnswerController(AnswerService answerService){
        this.answerService = answerService;
    }

    public AnswerService getAnswerService(){
        return answerService;
    }

    @PostMapping("/answer")
    @ResponseStatus(HttpStatus.CREATED)
    public void createAnswer(@RequestBody Answer newAnswer) throws AnswerAlreadyExistsException {
        answerService.add_answer(newAnswer);
    }

    @GetMapping("/Answer")
    public List<Answer> getallAnswer(){
        return answerService.getallAnswers();
    }

    @GetMapping("/Answer/{answerId}")
    public Answer searchAnswer(@PathVariable long answerId) throws AnnswerNotFoundException {
        return answerService.searchAnswer(answerId);
    }

    @DeleteMapping("/Answer/{answerId}")
    public Answer deleteAnswer(@PathVariable long answerId) throws AnnswerNotFoundException {
        return answerService.deleteAnswer(answerId);
    }
}


