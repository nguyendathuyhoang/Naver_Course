package com.Likelion_Week21.JPA_H2.Service;

import com.Likelion_Week21.JPA_H2.DTO.DepartmentDTO;
import com.Likelion_Week21.JPA_H2.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DepartmentService {
    void create (DepartmentDTO dept_dto);
    List<DepartmentDTO> findAll();
}
