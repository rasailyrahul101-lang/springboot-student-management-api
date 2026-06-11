package com.example.student_management_api.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public String getMessage(){
        return "Service Working";
    }
    public String getStudent(int id){
        return "Student " + id;
    }

    public String searchStudent(String name){
        return "Searching for " + name;
    }
}
