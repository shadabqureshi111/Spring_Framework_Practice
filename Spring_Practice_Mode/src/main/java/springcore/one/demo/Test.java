package springcore.one.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        System.out.println( "Hi.About Me!!" );
        ApplicationContext context= new ClassPathXmlApplicationContext
        		                    ("springcore/one/demo/config.xml");
        Student student1=(Student)context.getBean("student1");
		/* Student student2 = (Student) context.getBean("student2"); */
       System.out.println(student1);
		/* System.out.println(student2); */
       
        
    }
}
