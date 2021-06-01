package sc.fourteen.remove_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component("st")
public class Student 
{
	@Value("Shadab")
	private String s_name;
	//@Autowired
	private Address address;
	
	/*If you want to give "@Autowired" annotation then 
	  use of constructor field is not cumpulsory */
	public Student(Address address) {
		super();
		this.address = address;
	}
	/*If you want to give "@Autowired" annotation then 
	  use of constructor field is not cumpulsory */
	
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [s_name=" + s_name + ", address=" + address + "]";
	}
	
	
}
