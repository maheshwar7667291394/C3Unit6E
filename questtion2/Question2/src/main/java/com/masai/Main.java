package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		
		StudentService sS=ctx.getBean("studentService",StudentService.class);
		sS.printMap();
		
		sS.printList();
		sS.printAppName();
		
	}

}
