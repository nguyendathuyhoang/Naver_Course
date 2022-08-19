package com.likelion.threetier.service.impl;

import com.likelion.threetier.model.Student;
import com.likelion.threetier.repository.DemoRepository;
import com.likelion.threetier.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements DemoService<Student> {
    private final DemoRepository demoRepository;
    public StudentService(DemoRepository demoRepository)
    {
        this.demoRepository=demoRepository;
    }


    @Override
    public List<Student> getStudent() {
        return demoRepository.getStudent();
    }

    @Override
    public Student findStudent(long id) {
        return demoRepository.findStudent(id);
    }
}
