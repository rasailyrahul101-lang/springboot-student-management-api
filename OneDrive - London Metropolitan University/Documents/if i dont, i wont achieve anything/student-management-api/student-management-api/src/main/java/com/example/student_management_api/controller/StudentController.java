package com.example.student_management_api.controller;

import com.example.student_management_api.service.StudentService;
import org.springframework.web.bind.annotation.*;
import com.example.student_management_api.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service){
        this.service=service;
    }

    @GetMapping("/message")
    public String message(){
        return service.getMessage();
    }

    @GetMapping("/search")
    public String search(@RequestParam(required = false) String name){
        return service.searchStudent(name);
    }

    @GetMapping("/{id}")
    public String getStudent(@PathVariable int id){
        return service.getStudent(id);
    }


    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return student;
    }
}
