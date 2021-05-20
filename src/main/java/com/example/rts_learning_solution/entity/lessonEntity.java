package com.example.rts_learning_solution.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lesson")
public class lessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String name;
    private String duration;
    private String videoLink;
    private String htmlContent;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private courseEntity course;
    @OneToMany(
            mappedBy = "lesson"
    )
    private List<examEntity> exams = new ArrayList<>();

    public List<examEntity> getExams() {
        return exams;
    }

    public void setExams(List<examEntity> exams) {
        this.exams = exams;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public courseEntity getCourse() {
        return course;
    }

    public void setCourse(courseEntity course) {
        this.course = course;
    }
}
