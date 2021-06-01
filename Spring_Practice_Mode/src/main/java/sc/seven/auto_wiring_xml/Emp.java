package sc.seven.auto_wiring_xml;

public class Emp 
{
	private int emp_id;
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
