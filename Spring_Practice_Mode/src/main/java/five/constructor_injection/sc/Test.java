package five.constructor_injection.sc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("five/"
			                    + "constructor_injection/sc/config.xml");
	Person p = (Person) context.getBean("person1");
	System.out.println(p);
			
	}

}
