package com.example.rts_learning_solution.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class categoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(
            mappedBy = "category"
    )
    private List<courseEntity> coures = new ArrayList<>();
    @OneToMany(
            mappedBy = "category"
    )
    private List<postEntity> posts = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<courseEntity> getCoures() {
        return coures;
    }

    public void setCoures(List<courseEntity> coures) {
        this.coures = coures;
    }

    public List<postEntity> getPosts() {
        return posts;
    }

    public void setPosts(List<postEntity> posts) {
        this.posts = posts;
    }
}
