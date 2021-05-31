package com.fourteen.remove_xml.sc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	/*When we remove xml file and used class for 
	  configuration the "AnnotationConfigApplicationContext" use*/	
	ApplicationContext cxt=new AnnotationConfigApplicationContext
							(Java_Configuration.class);	
	
	/*1)When we gave "@Component("st") in Student.Class then 
	   we should give "st" in getBean
	  2) If you Defined Class in Java_Configuration and Use "Bean" Tag then 
	   we should give define class name ex.(getStudent);
	*/
	/* When We gave 3 name of bean then use name
	   otherwise you can use class name
	 Student student=(Student) cxt.getBean("getStudent");*/
	
	Student student=(Student) cxt.getBean("s1");
	System.out.println(student);
	
	}

}
