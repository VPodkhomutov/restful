package com.example.Rest;


import com.example.Rest.model.Student;
import com.example.Rest.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    private final StudentService studentService;

    public ClientController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/students")
    public void create(@RequestBody Student student) {
        studentService.create(student);
    }

    @GetMapping(value = "/students")
    public List<Student> read() {
        return  studentService.readAll();
    }

    @GetMapping(value = "/students/{id}")
    public Student read(@PathVariable(name = "id") Long id) {
        return studentService.read(id);
    }

    @DeleteMapping(value = "/students/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        studentService.delete(id);
    }

    @PutMapping(value = "/students/{id}")
    public void update(@RequestBody Student student, @PathVariable(name = "id") Long id) {
        studentService.update(student, id);
    }
}
