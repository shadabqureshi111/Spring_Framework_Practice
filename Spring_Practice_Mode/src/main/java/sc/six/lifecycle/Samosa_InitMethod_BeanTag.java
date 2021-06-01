package sc.six.lifecycle;

public class Samosa_InitMethod_BeanTag {
	private int price;

	public int getPrice() 
		{
			return price;
		}

	public void setPrice(int price) 
		{
			this.price = price;
		}

	@Override
	public String toString() 
		{
			return "\nSamosa [price=" + price + "]";
		}
	
	public void init()
	{
		System.out.println("This is samosa Init Method..!!!");
	}
	
	public void destroy()
	{
		System.out.println("This is samosa Destroy Method..!!!");
	}
}
