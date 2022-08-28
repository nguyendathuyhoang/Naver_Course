package com.Likelion22.Homework_Week22.Repository;

import com.Likelion22.Homework_Week22.DTO.DepartmentDTO;
import com.Likelion22.Homework_Week22.DTO.EmployeeDTO;
import com.Likelion22.Homework_Week22.Entity.Department;
import com.Likelion22.Homework_Week22.Entity.Employee;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface MyBatis {

    @Select("select d.*, count(e.employee_id) as SOLUONG from department d join employee e on d.department_id=e.department_id  where d.Department_id=#{departmentId}"
           +"group by d.department_id, d.dept_name, d.description")
    @Results(value = {@Result(property = "departmentId", column = "Department_id"),
            @Result(property = "dept_name", column = "dept_name"),
            @Result(property = "description", column = "description"),
            @Result(property = "numEmployee", column = "soluong")
    })
    DepartmentDTO getNumEmployee(Long deptId);

    @Select("Select e.*, d.department_id, d.dept_name, d.description from employee e join department d on e.department_id = d.department_id where Employee_id=#{employeeId}")
    @Results(value = {@Result(property = "employeeId", column = "employee_id"),
            @Result(property = "birthOfDate", column="birth_date"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "departmentId", column="Department_id"),
            @Result(property = "dept_name", column="Dept_name"),
            @Result(property = "description", column="Description")
    }
    )
    EmployeeDTO findByDepartmentId(Long emplId);
}
