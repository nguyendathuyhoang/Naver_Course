package com.Likelion22.Homework_Week22.Repository;

import com.Likelion22.Homework_Week22.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
