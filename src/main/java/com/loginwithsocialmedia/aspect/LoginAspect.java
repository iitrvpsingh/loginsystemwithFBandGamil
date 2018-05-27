package com.loginwithsocialmedia.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
	public static final Logger log = LoggerFactory.getLogger(LoginAspect.class);

	
	@Before("@annotation(com.loginwithsocialmedia.annotation.Timmed)")
	public void before(){
		System.out.println("Start Time: " + System.currentTimeMillis()/1000);
	}
	
	@After("@annotation(com.loginwithsocialmedia.annotation.Timmed)")
	public void after(){
		System.out.println("End Time: " + System.currentTimeMillis()/1000);
	}
}
