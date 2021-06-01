package sc.ten.standalone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	ApplicationContext cxt=new ClassPathXmlApplicationContext
			                       ("sc/ten/standalone_collection/config.xml");
	
	Standalone_Collection sc=(Standalone_Collection)cxt.getBean("sc");
	System.out.println(sc);
	System.out.println(sc.getName().getClass());
	System.out.println(sc.getNumber().getClass());
	System.out.println(sc.getCourse().getClass());
	
	}

}
