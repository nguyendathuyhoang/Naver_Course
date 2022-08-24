package com.Likelion_Week21.JPA_H2.Service;

import com.Likelion_Week21.JPA_H2.DTO.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    void create (EmployeeDTO employeeDTO);
    List<EmployeeDTO> findAll();
}
