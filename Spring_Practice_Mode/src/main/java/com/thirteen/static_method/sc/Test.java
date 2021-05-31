package com.thirteen.static_method.sc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
     AbstractApplicationContext cxt=new ClassPathXmlApplicationContext
                                    ("com/thirteen/static_method/sc/config.xml");
     Static_Method spel = (Static_Method) 
    		 							cxt.getBean("spel1");
	
	System.out.println(spel);
	
	}

}
