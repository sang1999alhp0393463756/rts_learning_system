package com.example.rts_learning_solution.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class userEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String fullName;
private String email;
private int phoneNumber;
private int role;
private String password;

    @ManyToMany
    @JoinTable(name = "register",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<courseEntity> courses = new ArrayList<>();
    @OneToMany(
            mappedBy = "user"
    )
    private List<postEntity> posts = new ArrayList<>();
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<courseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<courseEntity> courses) {
        this.courses = courses;
    }
}
