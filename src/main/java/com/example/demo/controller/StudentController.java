package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student>getStudents() {
        log.info("Fetching all Students from database...");
        return service.getAllStudents();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = service.getStudentById(id);
        if (null == student) {
            log.info("Student with id: " + id + " does not exist.!");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        log.info("Found Student: " + student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @GetMapping("/name/{name}")
    public List<Student>getStudentsByName(@PathVariable String name){
        return service.getStudentsByName(name);
    }
    @GetMapping("/surname/{surname}")
    public List<Student>getStudentsByLastName(@PathVariable String surname){
        return service.getStudentsByLastName(surname);
    }
    @PostMapping("/")
    public List<Student>addStudent(@RequestBody Student student) {
        log.info("Adding " + student + " to database");
        return service.addStudent(student);
    }
    @PutMapping("/")
    public Student student (@RequestBody Student student) {
        log.info("Updating: " + student + " to database");
        service.updateStudent(student);
        return service.getStudentById(student.getId());
    }

    @DeleteMapping("/{id}")
    public List<Student> deleteStudentById(@PathVariable Long id) {
        log.info("Deleting Student id is: " + id + " from database");
        service.deleteStudentById(id);
        return service.getAllStudents();
    }

}
