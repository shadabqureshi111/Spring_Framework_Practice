package sc.fourteen.remove_xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;

public class Address 
{
	@Value("Gwalior")
	private String city;
	
	@Value("M.P.")
	private String state;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	

}
