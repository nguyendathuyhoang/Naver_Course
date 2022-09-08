package LikeLion_Week31.Homework_Week31.DTO;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class EmployeeDto {
    private int employeeId;

    @NotEmpty(message = "Name khong duoc rong")
    @Length(min=10, max = 50, message = "Do dai name tu 10 den 50 ky tu")
    private String name;
    private Date birthDate;
    private String gender;

    @Email(message = "Email khong hop le")
    @NotEmpty(message = "Email khong duoc rong")
    private String email;
}
