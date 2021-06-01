package sc.fourteen.remove_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/* If you declare Bean then we will give class name "getStudent.class"
   @ComponentScan(basePackages="com.fourteen.remove_xml.sc") 
   is only use for Automatically object created 
*/
@Configuration
public class Java_Configuration 
		{
			@Bean
			public Address getAddress()
			{
				return new Address();
			}
			
			/*We give 3 name of Bean and use of any name we can run our project*/
			@Bean(name={"s1","s2","s3"})
			public Student getStudent()
			{
			/*If you want to give "@Autowired" annotation then 
			  use of constructor field is not cumpulsory */
				Student student =new Student(getAddress());
				
				return student;
			}
			
		} 
