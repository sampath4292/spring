package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.boot.SpringApplication;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

@SpringBootApplication
public class PaymentClass{

    public static void main(String[] args) {
        
        ApplicationContext context=SpringApplication.run(PaymentClass.class,args);
        Payment p=context.getBean(Payment.class);
        p.payment();
        p.ValidateCC(0);
        System.out.println(p.process());

    }
    
}


@Component
class Payment {

    void payment(){
        System.out.println(" inside payment ");
    }

    void ValidateCC(int x){
        System.out.println(" inside validate "+ x);
    }
    String process(){
        System.out.println(" inside Process ");
        return "anc";
    }
}

@Aspect
@Component
class SecurityAspect{

    @Before("execution(* com.example.demo.Payment.payment(..))")
    public void run()
    {
        System.out.println("before payment");
    }

    @After("execution(* com.example.demo.Payment.validateCC(..))")
    public void afterValidateCC() {

        System.out.println("Validation Completed");

    }

    @Around("execution(* com.example.demo.Payment.process(..))")
    public Object aroundProcess(
            ProceedingJoinPoint pjp)
            throws Throwable {

        System.out.println("Before Process");

        Object result = pjp.proceed();

        System.out.println("After Process");

        return result;
    }
}
