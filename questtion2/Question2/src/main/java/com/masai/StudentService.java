package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	
	@Autowired
	private Map<Student, Course> theMap; // inject 3 entries with valid details
	
	
	@Autowired
	private List<Student> theList=new ArrayList<>(); //inject List of 5 Student object
	
	@Value("${appname}")
	private String appName; //inject the AppName from the properties file
	//Hint: Make use of @Bean annotation to inject theMap and theList;
	
	
	public void printMap(){
	//print all the student's and their course details from theMap
		Set<Map.Entry<Student, Course>> keyVal=theMap.entrySet();
		for(Map.Entry<Student, Course> setval:keyVal) {
			System.out.println(setval.getKey());
			System.out.println(setval.getValue());
			System.out.println("--------");
		}
		
		
	}
	public void printList(){

		System.out.println("list Of student");
		
		Collections.sort(theList,(s1,s2)->s1.getMarks()>s2.getMarks()? +1:-1);
		 theList.forEach(s->{
			 System.out.println(s);
		 });
		 System.out.println("------------------------");
	}
	public void printAppName(){
	//print the injected appName
		
		System.out.println(appName);
	}

	

}
