/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.student.Service;

import com.fullstack.student.module.Student;
import com.fullstack.student.repo.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author filip
 */
@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    private StudentRepository studentrepository;
    
    @Override
    public Student saveStudent(Student student){
        return studentrepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentrepository.findAll();
    }
    
    
    
    
}
