package com.example.student_management_api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}
