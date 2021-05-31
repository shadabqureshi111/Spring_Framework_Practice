package eight.auto_wiring_annotation.sc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	AbstractApplicationContext cxt=new ClassPathXmlApplicationContext
			                       ("eight/auto_wiring_annotation/sc/config.xml");
	
	Emp emp=(Emp) cxt.getBean("emp");
	System.out.println(emp);
	}

}
