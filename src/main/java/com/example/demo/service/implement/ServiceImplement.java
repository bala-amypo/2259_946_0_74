package com.example.demo.service.implement;

import org. springframework.beans. factory. annotation. Autowired;
import java.util.*;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import org. springframework.stereotype.Service;

@Service
public class ServiceImplement implements StudentService {

    @Autowired
    StudentRepository repo;

    @Override
    public Student createData(Student stu) {
        return repo.save(stu);
    }

    @Override
    public List<Student> fetchData(){
        return repo.findAll();
    }

    @Override
    public Optional fetchDataById(int id){
        return repo.findById(3);
    }
}
