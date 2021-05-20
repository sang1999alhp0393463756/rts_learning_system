package com.example.rts_learning_solution.entity;

import javax.persistence.*;

@Entity
@Table(name = "slider")
public class slider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String imageLink;
    private String backLink;
    private String status;
    private String notes;
}
