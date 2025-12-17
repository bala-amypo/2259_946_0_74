package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService data;

    @PostMapping("/createrecord")
    public Student createData(@RequestBody Student stu){
        return data.createData(stu);
    }

    @GetMapping("/fetchrecord")
    public List<Student> fetchData(){
        return data.fetchData();
    }
    @GetMapping("/fetchDataById/{id}")
    public Optional fetchDataById(@PathVariable int id){
        return data.fetchDataById(id);
    }
}