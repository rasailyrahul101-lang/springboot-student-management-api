package com.example.student_management_api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @GetMapping
    public List<String> getTeacher(){
        return List.of(
          "Sita",
          "Gita",
          "Rita"
        );
    }
}
