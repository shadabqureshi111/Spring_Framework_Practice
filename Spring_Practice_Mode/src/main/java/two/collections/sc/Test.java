package two.collections.sc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("two/collections/sc/config.xml");
	Employee_Collection emp = (Employee_Collection)context.getBean("Emp_Detail");
	/* System.out.println(emp); */
	System.out.println(emp.getEmp_name());
	System.out.println(emp.getEmp_address());
	System.out.println(emp.getEmp_phone());
	System.out.println(emp.getEmp_course());
	

	}
}
