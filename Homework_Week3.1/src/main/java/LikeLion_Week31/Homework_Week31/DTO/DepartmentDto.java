package LikeLion_Week31.Homework_Week31.DTO;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class DepartmentDto {
    private int departmentId;

    @NotEmpty(message = "deptName khong duoc rong")
    @Length(min = 10, max = 50, message = "Do dai deptName tu 10 den 50 ky tu")
    private String deptName;

    @NotEmpty(message = "description khong duoc rong")
    private String description;

    @Valid
    private List<EmployeeDto> employeeDtoList;
}
