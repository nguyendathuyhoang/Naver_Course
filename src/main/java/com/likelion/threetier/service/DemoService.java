package com.likelion.threetier.service;

import com.likelion.threetier.model.Student;

import java.util.List;

public interface DemoService<Student> {
    public List<Student> getStudent();


    public Student findStudent(long id);
}
