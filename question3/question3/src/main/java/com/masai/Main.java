package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
  public  static void main(String[] args) {
	  
	  ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	  Presentation p=ctx.getBean("presentation",Presentation.class);
	  p.insertProduct();
	  
	  
  }

}
