package com.Likelion22.Homework_Week22.Service.ServiceImpl;

import com.Likelion22.Homework_Week22.DTO.EmployeeDTO;
import com.Likelion22.Homework_Week22.Entity.Employee;
import com.Likelion22.Homework_Week22.Repository.EmployeeRepository;
import com.Likelion22.Homework_Week22.Repository.MyBatis;
import com.Likelion22.Homework_Week22.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmployeeSerrviceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long emplId)
    {
        return employeeRepository.findById(emplId).orElseThrow();
    }

    public Employee createEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }


    //    public Employee updateEmDepartment(Long emplId, Long deptId)
//    {
//        Employee employee = employeeRepository.getById(emplId);
//        if (employee==null)
//        {
//            throw new RestClientException("Employee with id "+emplId+" not found");
//        }
//
//        Department department = departmentRepository.getById(deptId);
//        if (department==null)
//        {
//            throw new RestClientException("Employee with id "+deptId+" not found");
//        }
//
//        employee.setDepartment(department);
//        employeeRepository.save(employee);
//        return employee;
//    }
    @Resource
    MyBatis myBatis;

//    @Override
//    public List<Employee> getALLEmployeeMyBatis() {
//        return myBatis.getAllEmployees();
//    }
    @Override
    public EmployeeDTO findByDepartmentId(Long employeeId) {
        EmployeeDTO employee = myBatis.findByDepartmentId(employeeId);
        return employee;
    }
}
