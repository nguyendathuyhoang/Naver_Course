package com.Likelion_Week21.JPA_H2.Repository;

import com.Likelion_Week21.JPA_H2.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
