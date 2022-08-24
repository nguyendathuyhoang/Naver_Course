package com.Likelion_Week21.JPA_H2.Service.ServiceImpl;

import com.Likelion_Week21.JPA_H2.DTO.DepartmentDTO;
import com.Likelion_Week21.JPA_H2.DTO.EmployeeDTO;
import com.Likelion_Week21.JPA_H2.Entity.Department;
import com.Likelion_Week21.JPA_H2.Entity.Employee;
import com.Likelion_Week21.JPA_H2.Repository.EmployeeRepository;
import com.Likelion_Week21.JPA_H2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void create(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        //dept.setDepartmentId(dept_dto.getDepartmentId());
        employee.setName(employeeDTO.getName());
        employee.setBirthDate(employeeDTO.getBirthDate());
        employee.setGender(employeeDTO.getGender());
        employee.setDepartment(employee.getDepartment());
        employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeDTO> findAll() {
        return employeeRepository.findAll().stream()
                .map(Employee ->{
                    EmployeeDTO employeeDTO= new EmployeeDTO();
                    employeeDTO.setName(Employee.getName());
                    employeeDTO.setEmployeeId(Employee.getEmployeeId());
                    employeeDTO.setBirthDate(Employee.getBirthDate());
                    employeeDTO.setGender(Employee.getGender());
                    employeeDTO.setDepartment((Collection<Department>) Employee.getDepartment());
                    return employeeDTO;
                }).collect(Collectors.toList());
    }
}
