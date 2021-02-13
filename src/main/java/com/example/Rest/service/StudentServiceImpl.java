package com.example.Rest.service;

import com.example.Rest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void create(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> readAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student read(Long id) {
        Optional<Student> optionalStudent= studentRepository.findById(id);
        return optionalStudent.orElse(null);
    }

    @Override
    public void update(Student student, Long id) {
        if (studentRepository.findById(id).isPresent()) {
            studentRepository.save(student);
        }
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
