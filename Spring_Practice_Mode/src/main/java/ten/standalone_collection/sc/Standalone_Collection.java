package ten.standalone_collection.sc;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Standalone_Collection 
{
	private List<String> name;
	private Set <String> number;
	private Map<String,String> course;
	
	
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Set<String> getNumber() {
		return number;
	}
	public void setNumber(Set<String> number) {
		this.number = number;
	}
	public Map<String,String> getCourse() {
		return course;
	}
	public void setCourse(Map<String,String> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Standalone_Collection [name=" + name + ", number=" + number + ", course=" + course + "]";
	}
	
	
}
