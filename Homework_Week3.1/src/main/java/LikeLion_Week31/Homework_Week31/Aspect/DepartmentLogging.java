package LikeLion_Week31.Homework_Week31.Aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect
public class DepartmentLogging {
    private final Logger logger =  LoggerFactory.getLogger(DepartmentLogging.class);

    //@Before("execution(* LikeLion_Week31..Service..getDepartmentDto(..))")
    @Before (value = "execution(* LikeLion_Week31.Homework_Week31.Service.ServiceImpl.*(..)) ")
    public void beforeGetDepartmentDto(Joinpoint joinpoint)
    {
        logger.info("before called: "+joinpoint.toString());
    }

    @After (value = "execution(* LikeLion_Week31..Service..getDepartmentDto(..))")
    public void afterGetDepartmentDto(Joinpoint joinpoint)
    {
        logger.info("before called: "+joinpoint.toString());
    }
}
