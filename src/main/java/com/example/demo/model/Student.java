package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String last_name;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "university_ID")
    private University university;

    public Student(String name, String last_name, String imageUrl, University university) {
        this.name = name;
        this.last_name = last_name;
        this.imageUrl = imageUrl;
        this.university = university;
    }

    public Student() {
    }
}
