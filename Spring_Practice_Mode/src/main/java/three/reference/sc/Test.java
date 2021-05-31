package three.reference.sc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context =	new ClassPathXmlApplicationContext("three/reference/sc/config.xml");
		A ref = (A) context.getBean("aref");
		
		System.out.println(ref);
		System.out.println("X = "+ref.getX());
		System.out.println("Y = "+ref.getOb().getY());
		
	}

}
