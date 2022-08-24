package com.Likelion_Week21.JPA_H2.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private long employeeId;
    private String name;
    private String birthDate;
    private String gender;
    @ManyToOne
    @JoinColumn(name = "departmentId") // thông qua khóa ngoại departmentId
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Department department;
}
