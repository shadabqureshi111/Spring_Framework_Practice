package ten.standalone_collection.sc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	ApplicationContext cxt=new ClassPathXmlApplicationContext
			                       ("ten/standalone_collection/sc/config.xml");
	
	Standalone_Collection sc=(Standalone_Collection)cxt.getBean("sc");
	System.out.println(sc);
	System.out.println(sc.getName().getClass());
	System.out.println(sc.getNumber().getClass());
	System.out.println(sc.getCourse().getClass());
	
	}

}
