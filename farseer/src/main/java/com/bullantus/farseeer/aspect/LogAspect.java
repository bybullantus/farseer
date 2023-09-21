package com.bullantus.farseeer.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@AfterThrowing("execution(* com.atlas.seer.*.*.*(..))")
	public void WriteToLog(JoinPoint joinPoint) {
		System.out.println("Aspect  "+joinPoint.getSignature());
	}
}
