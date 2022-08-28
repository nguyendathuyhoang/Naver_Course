package com.Likelion22.Homework_Week22.Repository;

import com.Likelion22.Homework_Week22.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


}
