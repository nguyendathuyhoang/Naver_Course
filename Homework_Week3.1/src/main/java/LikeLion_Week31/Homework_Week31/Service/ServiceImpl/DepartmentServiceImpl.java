package LikeLion_Week31.Homework_Week31.Service.ServiceImpl;

import LikeLion_Week31.Homework_Week31.DTO.DepartmentDto;
import LikeLion_Week31.Homework_Week31.Service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto) {
        return departmentDto;
    }
}
