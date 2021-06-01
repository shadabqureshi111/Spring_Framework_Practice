package sc.six.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		/*
		 * when we want to use "registerShutdownHook" then we will use
		 * "AbstractApplicationContext"
		 */
	AbstractApplicationContext context = new ClassPathXmlApplicationContext
			                             ("sc/six/lifecycle/config.xml");

	Samosa_InitMethod_BeanTag samosa = (Samosa_InitMethod_BeanTag) 
										context.getBean("samosa");
	System.out.println(samosa);


	Pepsi_InitMethod_Interface pepsi = (Pepsi_InitMethod_Interface) 
										context.getBean("pepsi");
    System.out.print(pepsi);
    
    
    Lassi_InitMethod_Annotation lassi = (Lassi_InitMethod_Annotation) 
    									context.getBean("lassi");
    System.out.print(lassi);
    
		/* if we want to call the destroy method then "registerShutdownHook()" use */
		context.registerShutdownHook();
	}

}
