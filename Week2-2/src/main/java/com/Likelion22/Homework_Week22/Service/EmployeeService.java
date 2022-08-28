package com.Likelion22.Homework_Week22.Service;

import com.Likelion22.Homework_Week22.DTO.EmployeeDTO;
import com.Likelion22.Homework_Week22.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long emplId);
    Employee createEmployee(Employee employee);
    //Employee updateEmDepartment(Long emplId, Long deptId);
   //use my batis //List<Employee> getALLEmployeeMyBatis();
    EmployeeDTO findByDepartmentId(Long employeeId);


}
