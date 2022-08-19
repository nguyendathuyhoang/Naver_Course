package com.likelion.threetier.repository;

import com.likelion.threetier.model.Student;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DemoRepository {
    private List<Student> list;

    @PostConstruct
    public void StudentInfo()
    {
        list = new ArrayList<Student>();
        list.add(new Student(1,"HoangNguyen",21));
        list.add(new Student(2,"Audrey",20));
    }

    public List<Student> getStudent()
    {
        return list;
    }
    public Student findStudent(long id)
    {
        for (Student s:list)
        {
            if (s.getId()==id)
            {
                return new Student(s.getId(),
                        s.getName(),s.getAge());
            }
        }
        return null;
    }


}
