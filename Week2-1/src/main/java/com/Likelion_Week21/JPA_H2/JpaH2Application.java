package com.Likelion_Week21.JPA_H2;

import com.Likelion_Week21.JPA_H2.Entity.Department;
import com.Likelion_Week21.JPA_H2.Entity.Employee;
import com.Likelion_Week21.JPA_H2.Repository.DepartmentRepository;
import com.Likelion_Week21.JPA_H2.Repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
@RequiredArgsConstructor
public class JpaH2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaH2Application.class, args);
	}

	private final DepartmentRepository departmentRepository ;
	private final EmployeeRepository employeeRepository ;

	@Override
	public void run(String... args) throws Exception {
		// Tạo đối tượng Department có tham chiếu tới Employees
		Department department = new Department();
		department.setDept_name("Buon Ma Thuot");

		// Tạo đối tượng Employee
		Employee employee =new Employee();
		employee.setName("Hoang");
		employee.setDepartment(department);
		employee.setBirthDate("22-05-2001");

		department.setEmployees(Collections.singleton(employee));
		// Lưu vào db
		departmentRepository.saveAndFlush(department);

		// View
		employeeRepository.findAll().forEach(p->
		{
			System.out.println(p.getName());
			System.out.println(p.getBirthDate());
			System.out.println(p.getGender());
			System.out.println(p.getEmployeeId());
		});
	}
}
