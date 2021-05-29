package com.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp_Test {

	public static void main(String[] args) 
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("com/Collections/collection_config.xml");
	Employee_Collection emp = (Employee_Collection)context.getBean("Emp_Detail");
	/* System.out.println(emp); */
	System.out.println(emp.getEmp_name());
	System.out.println(emp.getEmp_address());
	System.out.println(emp.getEmp_phone());
	System.out.println(emp.getEmp_course());
	

	}
}
