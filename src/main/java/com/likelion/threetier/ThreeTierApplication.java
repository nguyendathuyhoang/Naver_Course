package com.likelion.threetier;

import com.likelion.threetier.model.Student;
import com.likelion.threetier.service.impl.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ThreeTierApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThreeTierApplication.class, args);
    }

}
