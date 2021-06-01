package sc.eight.auto_wiring_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	AbstractApplicationContext cxt=new ClassPathXmlApplicationContext
			                       ("sc/eight/auto_wiring_annotation/config.xml");
	
	Emp emp=(Emp) cxt.getBean("emp");
	System.out.println(emp);
	}

}
