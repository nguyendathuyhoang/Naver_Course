package com.Likelion22.Homework_Week22.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="DEPARTMENT")
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue
    @Column(name = "Department_id", nullable = false)
    private long departmentId;

    @Column(name = "Dept_name", length = 30, nullable = false)
    private String dept_name;

    @Column(name = "Description", length = 64, nullable = false)
    private String description;

//    @Column(name="Employees", nullable = false)
//    private long employees;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude
    @JsonIgnore
    private List<Employee> lstEmployee;

//    public Department(long departmentId, String dept_name, String description) {
//        this.departmentId = departmentId;
//        this.dept_name = dept_name;
//        this.description = description;
//
//    }
//
//    public long getDepartmentId() {
//        return departmentId;
//    }
//
//    public void setDepartmentId(long departmentId) {
//        this.departmentId = departmentId;
//    }
//
//    public String getDept_name() {
//        return dept_name;
//    }
//
//    public void setDept_name(String dept_name) {
//        this.dept_name = dept_name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}


