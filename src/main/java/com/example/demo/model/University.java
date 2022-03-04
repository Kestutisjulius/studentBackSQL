package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "university")
@Setter
@Getter
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_ID")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Student>students;

    public University(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public University() {
    }
}