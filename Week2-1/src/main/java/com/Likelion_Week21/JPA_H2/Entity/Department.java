package com.Likelion_Week21.JPA_H2.Entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;
import net.bytebuddy.asm.Advice;
//import lombok.*;

import java.util.Collection;
@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue
    private long departmentId;
    private String dept_name;
    private String description;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude
    private Collection<Employee> employees;


}
