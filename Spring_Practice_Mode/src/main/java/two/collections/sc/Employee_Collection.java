package two.collections.sc;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee_Collection 
	{
		private String emp_name;
		private List<String> emp_phone;
		private Set<String> emp_address;
		private Map<String,String> emp_course;
		public String getEmp_name() {
			return emp_name;
		}
		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}
		public List<String> getEmp_phone() {
			return emp_phone;
		}
		public void setEmp_phone(List<String> emp_phone) {
			this.emp_phone = emp_phone;
		}
		public Set<String> getEmp_address() {
			return emp_address;
		}
		public void setEmp_address(Set<String> emp_address) {
			this.emp_address = emp_address;
		}
		public Map<String, String> getEmp_course() {
			return emp_course;
		}
		public void setEmp_course(Map<String, String> emp_course) {
			this.emp_course = emp_course;
		}
		
		@Override
		public String toString() {
			return "Employee_Collection \n"
			+ "[emp_name=" + emp_name + ", \n"
		    + "emp_phone=" + emp_phone + ", \n"
		    + "emp_address=" + emp_address + ", \n"
		    + "emp_course=" + emp_course + "]";
		}
		
		
		
	
	}
