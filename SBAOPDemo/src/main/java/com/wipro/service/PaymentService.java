package com.wipro.service; 

import org.springframework.stereotype.Component; 
import com.wipro.exception.InvalidAmountException; 

@Component 
public class PaymentService { 

 

public void doPayment(double amt) 

{ 

if ((amt==0)||(amt<0)) 

throw new InvalidAmountException("Invalid Amount for Payment:"+amt); 

else 

System.out.println("Payment done"); 

} 

} 