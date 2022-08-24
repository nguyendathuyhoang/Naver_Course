package com.Likelion_Week21.JPA_H2.DTO;

import com.Likelion_Week21.JPA_H2.Entity.Department;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor public class EmployeeDTO implements Serializable {
    private long employeeId;
    private String birthDate;
    private String name;
    private String gender;
    private Collection<Department> department;
}
