package com.example.student_management_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public String getBook(@PathVariable int id){
        return "Book " + id;
    }

    @GetMapping("/search")
    public String searchBook(@RequestParam String title){
        return "Searching " + title;
    }
}
