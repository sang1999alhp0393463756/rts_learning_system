package com.example.rts_learning_solution.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "exam")
public class examEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dimensions;
    private String name;
    private int isPractice;
    private int isActive;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private lessonEntity lesson;
    @OneToMany(
            mappedBy = "exam"
    )
    private List<questionEntity> questions = new ArrayList<>();

    public List<questionEntity> getQuestions() {
        return questions;
    }

    public void setQuestions(List<questionEntity> questions) {
        this.questions = questions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsPractice() {
        return isPractice;
    }

    public void setIsPractice(int isPractice) {
        this.isPractice = isPractice;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public lessonEntity getLesson() {
        return lesson;
    }

    public void setLesson(lessonEntity lesson) {
        this.lesson = lesson;
    }
}
