package nine.qualifier_anno.sc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Emp 
{
	
	private int emp_id;
	/*When We have multiple Adress Bean and we want single Adress bean 
    then through Annotation we can use "Qualifier".*/
	@Autowired
	@Qualifier("adrs") 
	private Adress adress;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Emp [emp_id=" + emp_id + ", adress=" + adress + "]";
	}
	

}
