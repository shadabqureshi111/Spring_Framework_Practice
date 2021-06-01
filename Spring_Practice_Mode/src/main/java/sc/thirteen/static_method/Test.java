package sc.thirteen.static_method;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
     AbstractApplicationContext cxt=new ClassPathXmlApplicationContext
                                    ("sc/thirteen/static_method/config.xml");
     Static_Method spel = (Static_Method) 
    		 							cxt.getBean("spel1");
	
	System.out.println(spel);
	
	}

}
