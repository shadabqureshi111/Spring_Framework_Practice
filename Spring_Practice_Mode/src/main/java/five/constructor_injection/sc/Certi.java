package five.constructor_injection.sc;

public class Certi 
{
	private String certi_name;
	
	public Certi(String certi_name)
	{
		this.certi_name=certi_name;
	}

	@Override
	public String toString() {
		return "[certi_name=" + certi_name + "]";
	}
	
	

}
