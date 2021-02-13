package com.example.Rest.service;

import com.example.Rest.model.Student;

import java.util.List;

public interface StudentService {

    void create(Student student);

    List<Student> readAll();

    Student read(Long id);

    void update(Student student, Long id);

    void delete(Long id);
}
