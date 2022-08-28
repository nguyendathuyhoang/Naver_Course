package com.Likelion22.Homework_Week22.Service.ServiceImpl;

import com.Likelion22.Homework_Week22.DTO.DepartmentDTO;
import com.Likelion22.Homework_Week22.Entity.Department;
import com.Likelion22.Homework_Week22.Repository.DepartmentRepository;
import com.Likelion22.Homework_Week22.Repository.MyBatis;
import com.Likelion22.Homework_Week22.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Resource
    MyBatis myBatis;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDeptById(long deptId) {
        return departmentRepository.findById(deptId).orElseThrow();
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public DepartmentDTO getNumAllEmployee(Long departmentId) {
        DepartmentDTO dept = myBatis.getNumEmployee(departmentId);
        return dept;
    }

}

