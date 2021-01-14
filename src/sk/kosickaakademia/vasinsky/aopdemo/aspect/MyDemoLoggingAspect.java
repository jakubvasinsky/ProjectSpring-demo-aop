package sk.kosickaakademia.vasinsky.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//@Before("execution(public void Add*())")
@Before("execution(* sk.kosickaakademia.vasinsky.aopdemo.dao.*.*(..))")
public void beforeAddAccountAdvice(){
    System.out.println("\n =====>>> Executing @Before advice on method...");
}

}
