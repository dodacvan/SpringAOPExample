package spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

// I always prefer annotation but we also have
// option to configure aspects in spring configuration file. 
// For example, let’s say we have a class as below.
public class EmployeeXMLConfigAspect {
    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("EmployeeXMLConfigAspect:: Before invoking getName() method");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("EmployeeXMLConfigAspect:: After invoking getName() method. Return value="+value);
        return value;
    }
    
    // We can configure it by including following configuration in the Spring Bean config file.
    
}
