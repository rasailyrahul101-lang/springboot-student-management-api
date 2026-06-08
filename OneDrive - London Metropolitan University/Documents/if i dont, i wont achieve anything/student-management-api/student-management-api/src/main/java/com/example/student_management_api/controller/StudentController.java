package com.example.student_management_api.controller;

import org.springframework.web.bind.annotation.*;
import com.example.student_management_api.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/{id}")
    public String getStudent(@PathVariable int id){
        return "Student " + id;
    }

    @GetMapping("/search")
    public String search(@RequestParam(required = false) String name){
        return "Searching for " + name;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return student;
    }
}
