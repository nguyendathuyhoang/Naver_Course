package LikeLion_Week31.Homework_Week31.Controller;

import LikeLion_Week31.Homework_Week31.DTO.DepartmentDto;
import LikeLion_Week31.Homework_Week31.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @PostMapping("/test")
    public String test(@RequestBody @Valid DepartmentDto departmentDto, BindingResult bindingResult)
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

    @GetMapping("/getDepartment")
    public DepartmentDto getDepartmentDto(@RequestBody @Valid DepartmentDto departmentDto)
    {
        DepartmentDto departmentDto1 = departmentService.getDepartmentDto(departmentDto);
        return departmentDto1;
    }
}
