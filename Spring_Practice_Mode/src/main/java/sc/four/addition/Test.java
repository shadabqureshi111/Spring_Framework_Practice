package sc.four.addition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context=	new ClassPathXmlApplicationContext
				                    ("sc/four/addition/config.xml");
		Sum s=(Sum)context.getBean("sum");
		s.getSum();
		System.out.println("\n");
		Sum s1=(Sum)context.getBean("sum1");
		s1.getSum();
			
	}

}
