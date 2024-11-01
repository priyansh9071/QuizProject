package com.priyansh.QuizApp.service;

import com.priyansh.QuizApp.entity.QuizQuestion;
import com.priyansh.QuizApp.repo.QuestionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizQuestionService {
    @Autowired
    QuestionRepo questionRepo;

    public QuizQuestionService() {
    }

    public List<QuizQuestion> getAllTheQuestion() {
        return this.questionRepo.findAll();
    }

    public List<QuizQuestion> saveQuestions(List<QuizQuestion> quizQuestion) {
        return this.questionRepo.saveAll(quizQuestion);
    }
}
