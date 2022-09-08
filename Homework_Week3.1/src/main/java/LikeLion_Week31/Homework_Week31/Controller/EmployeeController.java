package LikeLion_Week31.Homework_Week31.Controller;

import LikeLion_Week31.Homework_Week31.DTO.EmployeeDto;
import LikeLion_Week31.Homework_Week31.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;



@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/test")
    public String test(@RequestBody @Valid EmployeeDto employeeDto, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors()){
            Map<String, String> errors= new HashMap<>();

            bindingResult.getFieldErrors().forEach(
                    error -> errors.put(error.getField(), error.getDefaultMessage())
            );

            String errorMsg= "";

            for(String key: errors.keySet()){
                errorMsg+= "Lỗi ở: " + key + ", lí do: " + errors.get(key) + "\n";
            }
            return errorMsg;
        }

        return "Các trường truyền vào hợp lệ!";
    }

    @GetMapping("/getEmployee")
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto)
    {
        EmployeeDto employeeDto1 = employeeService.getEmployeeDto(employeeDto);
        return employeeDto1;
    }
}
