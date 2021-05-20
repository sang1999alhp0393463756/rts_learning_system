package com.example.rts_learning_solution.entity;

import javax.persistence.*;

@Entity
@Table(name = "options")
public class optionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String optionText;
    private String explanation;
    private int isCorrect;
    private int isKey;

    public int getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(int isCorrect) {
        this.isCorrect = isCorrect;
    }

    @ManyToOne
    @JoinColumn(name = "question_id")
    private questionEntity question;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public int getIsKey() {
        return isKey;
    }

    public void setIsKey(int isKey) {
        this.isKey = isKey;
    }

    public questionEntity getQuestion() {
        return question;
    }

    public void setQuestion(questionEntity question) {
        this.question = question;
    }
}
