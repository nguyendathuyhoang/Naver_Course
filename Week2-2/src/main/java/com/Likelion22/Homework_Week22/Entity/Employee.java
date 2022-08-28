package com.Likelion22.Homework_Week22.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="EMPLOYEE")
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="Employee_id", nullable = false)
    private long employeeId;

    @Column(name="Name", length = 40,nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "BirthDate",nullable = false)
    private Date birthOfDate;

    @Column(name = "Gender", nullable = false)
    private String gender;

    //@Column(name = "DepartmentId", nullable = false)
    //private long departmentId;

    @ManyToOne()
    @JoinColumn(name = "Department_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Department department;

//    public Employee(long employeeId, String name, Date birthOfDate, String gender, Department department) {
//        this.employeeId = employeeId;
//        this.name = name;
//        this.birthOfDate = birthOfDate;
//        this.gender = gender;
//        this.department = department;
//    }
//
//    public long getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(long employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Date getBirthOfDate() {
//        return birthOfDate;
//    }
//
//    public void setBirthOfDate(Date birthOfDate) {
//        this.birthOfDate = birthOfDate;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }


//    public long getDepartment() {
//        return department.getDepartmentId();
//    }
//
//    public void setDepartment(long department) {
//        this.department.setDepartmentId( department);
//    }
}
