package sc.six.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Lassi_InitMethod_Annotation 
{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nLassi[price=" + price + "]\n";
	}
	
	  //Init Method
	  @PostConstruct 
	  public void start() 
	  {
	  System.out.println("This is Lassi Init Method..!!!"); 
	  } 
	  
	  //Destroy Method
	  @PreDestroy 
	  public void end() {
	  System.out.println("\nThis is lassi Destroy Method..!!!"); }
	 
}
