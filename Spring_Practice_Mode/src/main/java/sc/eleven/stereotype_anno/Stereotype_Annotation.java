package sc.eleven.stereotype_anno;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*If Component annotation is blank then IOC Container Fetch "Class Name" 
  in Main method..............
 *If you Want to give a name then Ioc fetch componnet name  
 

 */
//For "Singleton" when we run our project then we get single object 
//For "prototype" when we run our project then we get multiple object 
//BYdefault Scope Is SingleTon

//@Scope("singleton")
//@Component("stereo")
@Scope("prototype")
@Component
public class Stereotype_Annotation 
{
	@Value("Shadab")
	private String s_name;
	@Value("Gwalior")
	private String s_city;
	
	@Value("#{arraylist}")
	private List<String> address;
	
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_city() {
		return s_city;
	}
	public void setS_city(String s_city) {
		this.s_city = s_city;
	}

	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Stereotype_Annotation [s_name=" + s_name + ", s_city=" + s_city + ", address=" + address + "]";
	}
	
	
}
