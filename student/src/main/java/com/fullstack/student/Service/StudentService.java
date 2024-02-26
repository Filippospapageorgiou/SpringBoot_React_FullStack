/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fullstack.student.Service;

import com.fullstack.student.module.Student;
import java.util.List;
/**
 *
 * @author filip
 */
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
