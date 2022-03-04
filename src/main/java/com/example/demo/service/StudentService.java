package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student>getAllStudents(){
        return repository.findAll();
    }
    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }
    public List<Student> getStudentsByName(String name) {
        return repository.getStudentsByName(name);
    }
    public List<Student> getStudentsByLastName(String lastName) {
        return repository.getStudentsByLastName(lastName);
    }
    public List<Student> addStudent(Student student) {
        repository.save(student);
        return repository.findAll();
    }
    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }
    public void updateStudent(Student student) {
        repository.save(student);
    }
}
