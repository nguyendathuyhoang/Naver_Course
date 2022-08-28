package com.Likelion22.Homework_Week22.Controller;

import com.Likelion22.Homework_Week22.DTO.EmployeeDTO;
import com.Likelion22.Homework_Week22.Entity.Employee;
import com.Likelion22.Homework_Week22.Service.ServiceImpl.EmployeeSerrviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
//    private List<Employee> lstEmployee = new ArrayList<>();
//
//    @PostConstruct
//    public void initEmpl()
//    {
//        lstEmployee.add(null);
//
//        lstEmployee.add(new Employee(1,"Hoang", null,"Male",null));
//
//    }
//    @GetMapping(value = "/empl")
//    public List<Employee> getLstEmployee()
//    {
//        return lstEmployee;
//    }
//    @PostMapping(value = "/empl")
//    public List<Employee> addEmpl(@RequestParam (name="deptId") long deptId, Employee employee)
//    {
//        employee = null;
//        for (Employee e:lstEmployee)
//        {
//            if (e.getDepartment().getDepartmentId()==deptId)
//            {
//                employee=e;
//            }
//        }
//        lstEmployee.add(employee);
//        return lstEmployee;
//    }

    @Autowired
    EmployeeSerrviceImpl employeeSerrvice;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/")
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeSerrvice.createEmployee(employee);
    }

    @GetMapping("/{emplId}")
    public Employee getEmployee(@PathVariable Long emplId)
    {
        Employee employee =employeeSerrvice.getEmployeeById(emplId);
        return employee;
    }

    @GetMapping()
    public List<Employee> getAllEmployees()
    {
        return employeeSerrvice.getAllEmployees();
    }


}
