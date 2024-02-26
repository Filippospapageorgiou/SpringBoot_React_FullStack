/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.student.controller;

import com.fullstack.student.Service.StudentService;
import com.fullstack.student.module.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author filip
 */
@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    
    @Autowired
    private StudentService studentservice;
    
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentservice.saveStudent(student);
        return "New student is added";
    }
    
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentservice.getAllStudents();
    }
    
}
