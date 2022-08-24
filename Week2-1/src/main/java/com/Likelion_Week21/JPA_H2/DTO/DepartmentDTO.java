package com.Likelion_Week21.JPA_H2.DTO;

import com.Likelion_Week21.JPA_H2.Entity.Employee;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
public class DepartmentDTO implements Serializable {
    private long departmentId;
    private String dept_name;
    private String description;
    private Collection<Employee> employees;
}
