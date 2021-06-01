package sc.nine.qualifier_anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	AbstractApplicationContext cxt=new ClassPathXmlApplicationContext
			                       ("sc/nine/qualifier_anno/config.xml");
	
	Emp emp=(Emp) cxt.getBean("emp");
	System.out.println(emp);
	}

}
