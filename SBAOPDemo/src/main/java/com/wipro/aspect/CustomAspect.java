package com.wipro.aspect; 

import java.time.LocalDateTime; 
import org.aspectj.lang.JoinPoint; 
import org.aspectj.lang.ProceedingJoinPoint; 
import org.aspectj.lang.annotation.After; 
import org.aspectj.lang.annotation.AfterReturning; 
import org.aspectj.lang.annotation.AfterThrowing; 
import org.aspectj.lang.annotation.Around; 
import org.aspectj.lang.annotation.Aspect; 
import org.aspectj.lang.annotation.Before; 
import org.aspectj.lang.annotation.Pointcut; 
import org.springframework.stereotype.Component; 
import com.wipro.service2.Emp; 

@Component 
@Aspect 

public class CustomAspect { 
	@Pointcut("execution(* com.wipro.service.*.*(..))") 
	
	void pc1() 
	{ 
	
	} 

	@Pointcut("execution(* com.wipro.service2.UserService.getUserById(..))") 
	void pc2() 
	{ 

	} 
	@Pointcut("execution(* com.wipro.service.PaymentService.doPayment(..))") 
	void pc3() 
	{ 

	} 

	@Pointcut("execution(* com.wipro.service2.UserService.display(..))") 
	
	void pc4() 
	
	{ 
	
	 
	
	} 
	
	@Before("pc1()") 
	
	public void logBefore(JoinPoint jp) 
	
	{ 
	
		String methodName=jp.getSignature().getName(); 
		
		System.out.println(methodName+" called at "+LocalDateTime.now()); 
	
	 
	
	} 
	
	@After("pc1()") 
	
	public void logAfter(JoinPoint jp) 
	
	{ 
	
		String methodName=jp.getSignature().getName(); 
		
		System.out.println(methodName+" completed execution at "+LocalDateTime.now()); 
		
		System.out.println("*******************"); 
	
	} 
	@AfterReturning(pointcut ="pc2()",returning ="emp") 
	
	public void getReturnValue(Emp emp) { 
	
		System.out.println("Method executed successfully with result:"+emp);
	} 
		
	@AfterThrowing(pointcut ="pc3()",throwing ="ex") 
	
	public void catchException(Exception ex) { 
	
	 
	
	System.out.println("Exception received:"+ex.getMessage()); 
	
	} 

	@Around("pc4()")  
	
	public Object aroundUsage(ProceedingJoinPoint pjp) throws Throwable { 
	
		long 
		
		startTime=System.currentTimeMillis(); 
		
		System.out.println("Before Calling  display method - statement1"); 
		
		System.out.println("Before Calling  display method - statement2"); 
		
		System.out.println("Before Calling  display method - statement3"); 
		
		 
		
		Object result=pjp.proceed(); 
		
		 
		
		long endTime=System.currentTimeMillis(); 
		
		System.out.println("After Calling  display method - statement1"); 
		
		System.out.println("After Calling  display method - statement2"); 
		
		System.out.println("After Calling  display method - statement3"); 
		
		System.out.println("Total time taken for execution:"+(endTime-startTime)); 
		
		return result; 
	} 
	


} 