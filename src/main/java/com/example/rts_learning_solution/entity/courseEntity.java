package com.example.rts_learning_solution.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "course")
public class courseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String thumbnail;
    private String title;
    private String image;
    private String tagLine;
    private String description;
    private String duration;
    private Float listPrice;
    private Float salePrice;
    private String status;
    private int codeTeach;

    public List<lessonEntity> getLessons() {
        return lessons;
    }

    public void setLessons(List<lessonEntity> lessons) {
        this.lessons = lessons;
    }

    public int getCodeTeach() {
        return codeTeach;
    }

    public void setCodeTeach(int codeTeach) {
        this.codeTeach = codeTeach;
    }

    @OneToMany(
            mappedBy = "course"
    )
    private List<voteEntity> votes = new ArrayList<>();
    @ManyToMany(mappedBy = "courses")
    private List<userEntity> users = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "category_id")
    private categoryEntity category;
    @OneToMany(
            mappedBy = "course"
    )
    private List<lessonEntity> lessons = new ArrayList<>();
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Float getListPrice() {
        return listPrice;
    }

    public void setListPrice(Float listPrice) {
        this.listPrice = listPrice;
    }


    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<voteEntity> getVotes() {
        return votes;
    }

    public void setVotes(List<voteEntity> votes) {
        this.votes = votes;
    }

    public categoryEntity getCategory() {
        return category;
    }

    public void setCategory(categoryEntity category) {
        this.category = category;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<userEntity> getUsers() {
        return users;
    }

    public void setUsers(List<userEntity> users) {
        this.users = users;
    }
}
