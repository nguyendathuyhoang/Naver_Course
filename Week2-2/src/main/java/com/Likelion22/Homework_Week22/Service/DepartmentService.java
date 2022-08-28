package com.Likelion22.Homework_Week22.Service;

import com.Likelion22.Homework_Week22.DTO.DepartmentDTO;
import com.Likelion22.Homework_Week22.Entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDeptById(long deptId);
    Department createDepartment(Department department);

    DepartmentDTO getNumAllEmployee(Long departmentId);
}
