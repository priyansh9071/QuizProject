package com.priyansh.QuizApp.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import java.util.List;

@Entity
public class QuizQuestion {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long Id;
    private String question;
    private String correctAnswer;
    @ElementCollection
    @CollectionTable(
            name = "options",
            joinColumns = {@JoinColumn(
                    name = "question_id"
            )}
    )
    @Column(
            name = "option_text"
    )
    private List<String> allTheOptions;

    public QuizQuestion() {
    }

    public long getId() {
        return this.Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAllTheOptions() {
        return this.allTheOptions;
    }

    public void setAllTheOptions(List<String> allTheOptions) {
        this.allTheOptions = allTheOptions;
    }
}
