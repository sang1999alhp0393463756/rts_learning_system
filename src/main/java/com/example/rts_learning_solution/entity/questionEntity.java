package com.example.rts_learning_solution.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question")
public class questionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String mediaLink;
    private int number;
    private String image;
    @ManyToOne
    @JoinColumn(name = "exam_id")
    private examEntity exam;

    private int isActive;
    @OneToMany(
            mappedBy = "question"
    )
    private List<optionEntity> options = new ArrayList<>();
    public List<optionEntity> getOptions() {
        return options;
    }

    public void setOptions(List<optionEntity> options) {
        this.options = options;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMediaLink() {
        return mediaLink;
    }

    public void setMediaLink(String mediaLink) {
        this.mediaLink = mediaLink;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public examEntity getExam() {
        return exam;
    }

    public void setExam(examEntity exam) {
        this.exam = exam;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
}
