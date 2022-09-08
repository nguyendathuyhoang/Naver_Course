package LikeLion_Week31.Homework_Week31.Aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class EmployeeLogging {
    private Logger logger = LoggerFactory.getLogger(EmployeeLogging.class);

   // @AfterThrowing("execution(*LikeLion_Week31.Homework_Week31.Service.ServiceImpl.EmployeeServiceImpl.getEmployeeDto()
    @AfterThrowing("execution(* LikeLion_Week31..Service..getEmployeeDto(..))")
    public void beforeEmployeeService(Joinpoint joinpoint)
    {
        logger.error("Before called "+joinpoint.toString());
    }

}
