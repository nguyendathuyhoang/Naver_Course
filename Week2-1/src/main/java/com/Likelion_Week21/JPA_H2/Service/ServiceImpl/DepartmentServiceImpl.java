package com.Likelion_Week21.JPA_H2.Service.ServiceImpl;

import com.Likelion_Week21.JPA_H2.DTO.DepartmentDTO;
import com.Likelion_Week21.JPA_H2.Entity.Department;
import com.Likelion_Week21.JPA_H2.Repository.DepartmentRepository;
import com.Likelion_Week21.JPA_H2.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void create(DepartmentDTO dept_dto) {
        Department dept = new Department();
        //dept.setDepartmentId(dept_dto.getDepartmentId());
        dept.setDept_name(dept_dto.getDept_name());
        dept.setDescription(dept_dto.getDescription());
        departmentRepository.save(dept);
    }

    @Override
    public List<DepartmentDTO> findAll() {
        return departmentRepository.findAll().stream()
                .map(Department ->{
                    DepartmentDTO dept_dto = new DepartmentDTO();
                    dept_dto.setDepartmentId(Department.getDepartmentId());
                    dept_dto.setDept_name(Department.getDept_name());
                    dept_dto.setDescription(Department.getDescription());
                    return dept_dto;
                }).collect(Collectors.toList());
    }
}
