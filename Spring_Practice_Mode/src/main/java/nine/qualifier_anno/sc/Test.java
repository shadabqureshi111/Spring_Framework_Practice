package nine.qualifier_anno.sc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	AbstractApplicationContext cxt=new ClassPathXmlApplicationContext
			                       ("nine/qualifier_anno/sc/config.xml");
	
	Emp emp=(Emp) cxt.getBean("emp");
	System.out.println(emp);
	}

}
