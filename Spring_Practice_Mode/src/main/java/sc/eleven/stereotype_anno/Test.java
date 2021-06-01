package sc.eleven.stereotype_anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	AbstractApplicationContext cxt=new ClassPathXmlApplicationContext
			                       ("sc/eleven/stereotype_anno/config.xml");
	
	/*Stereotype_Annotation stereotype_Annotation=(Stereotype_Annotation)
									              cxt.getBean("stereo");
	*/
	Stereotype_Annotation stereotype_Annotation=(Stereotype_Annotation)
            cxt.getBean("stereotype_Annotation");
	System.out.println(stereotype_Annotation);
	
	Stereotype_Annotation s=(Stereotype_Annotation)
            cxt.getBean("stereotype_Annotation");
	Stereotype_Annotation s2=(Stereotype_Annotation)
            cxt.getBean("stereotype_Annotation");
	System.out.println("HashCode 1 = "+s.hashCode());
	System.out.println("HashCode 2 = "+s2.hashCode());
	
	
	}

}
