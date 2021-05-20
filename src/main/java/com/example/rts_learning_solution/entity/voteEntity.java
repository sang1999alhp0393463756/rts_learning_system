package com.example.rts_learning_solution.entity;

import javax.persistence.*;

@Entity
@Table(name = "vote")
public class voteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int point;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private courseEntity course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public courseEntity getCourse() {
        return course;
    }

    public void setCourse(courseEntity course) {
        this.course = course;
    }
}
