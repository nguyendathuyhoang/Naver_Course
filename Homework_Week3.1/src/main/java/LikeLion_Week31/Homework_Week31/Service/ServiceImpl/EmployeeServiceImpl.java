package LikeLion_Week31.Homework_Week31.Service.ServiceImpl;

import LikeLion_Week31.Homework_Week31.DTO.EmployeeDto;
import LikeLion_Week31.Homework_Week31.Service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) {
        return employeeDto;
    }
}
