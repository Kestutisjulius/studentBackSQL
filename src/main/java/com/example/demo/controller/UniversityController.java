package com.example.demo.controller;

import com.example.demo.model.University;
import com.example.demo.service.UniversityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/universities")
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class UniversityController {

    @Autowired
    private UniversityService service;

    @GetMapping
    public List<University>getUniversities(){
        log.info("Feching all Universities from database...");
        return service.getAllUniversities();
    }
}
