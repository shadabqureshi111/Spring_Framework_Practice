package sc.eight.auto_wiring_annotation;

import org.springframework.beans.factory.annotation.Autowired;


public class Emp 
{
	
	private int emp_id;
	
	@Autowired
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
