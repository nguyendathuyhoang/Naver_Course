package com.Likelion_Week21.JPA_H2.Repository;

import com.Likelion_Week21.JPA_H2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
