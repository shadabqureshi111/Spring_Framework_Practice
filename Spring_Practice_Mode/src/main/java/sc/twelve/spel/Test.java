package sc.twelve.spel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
     AbstractApplicationContext cxt=new ClassPathXmlApplicationContext
                                    ("sc/twelve/spel/config.xml");
     Spring_Expreession_Language spel = (Spring_Expreession_Language) 
    		 							cxt.getBean("spel1");
	
	System.out.println(spel);
	
	}

}
