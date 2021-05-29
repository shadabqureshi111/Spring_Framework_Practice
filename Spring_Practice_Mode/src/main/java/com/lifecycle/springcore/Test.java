package com.lifecycle.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/lifecycle/springcore/config.xml");
	Samosa samosa = (Samosa)context.getBean("samosa");
	System.out.println(samosa);
	Pepsi pepsi = (Pepsi) context.getBean("pepsi");
	System.out.print(pepsi);
	/*if we want to call the destroy method then "registerShutdownHook()" use*/
	 context.registerShutdownHook(); 
	}

}
