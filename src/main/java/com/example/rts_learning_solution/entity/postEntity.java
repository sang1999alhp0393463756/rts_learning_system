package com.example.rts_learning_solution.entity;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class postEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String thumbnail;
    private String title;
    private String briefInfo;
    private String fullContent;
    private String ebookLink;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private userEntity user;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private categoryEntity category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBriefInfo() {
        return briefInfo;
    }

    public void setBriefInfo(String briefInfo) {
        this.briefInfo = briefInfo;
    }

    public String getFullContent() {
        return fullContent;
    }

    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }

    public String getEbookLink() {
        return ebookLink;
    }

    public void setEbookLink(String ebookLink) {
        this.ebookLink = ebookLink;
    }

    public userEntity getUser() {
        return user;
    }

    public void setUser(userEntity user) {
        this.user = user;
    }

    public categoryEntity getCategory() {
        return category;
    }

    public void setCategory(categoryEntity category) {
        this.category = category;
    }
}
