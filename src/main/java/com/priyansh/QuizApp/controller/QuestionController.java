
package com.priyansh.QuizApp.controller;

import com.priyansh.QuizApp.entity.QuizQuestion;
import com.priyansh.QuizApp.service.QuizQuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
        origins = {"http://127.0.0.1:5500"}
)
@RestController
@RequestMapping({"api"})
public class QuestionController {
    @Autowired
    QuizQuestionService quizQuestionService;

    public QuestionController() {
    }

    @GetMapping({"/all"})
    public List<QuizQuestion> getAllTheQuestions() {
        return this.quizQuestionService.getAllTheQuestion();
    }

    @PostMapping(
            value = {"/save"},
            consumes = {"application/json"},
            produces = {"application/json"}
    )
    public List<QuizQuestion> saveAllTheQuestions(@RequestBody List<QuizQuestion> quizQuestion) {
        return this.quizQuestionService.saveQuestions(quizQuestion);
    }
}
