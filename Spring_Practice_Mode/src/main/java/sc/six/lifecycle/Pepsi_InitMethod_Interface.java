package sc.six.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi_InitMethod_Interface implements InitializingBean,DisposableBean 
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
			return "Pepsi [price=" + price + "]";
		}
		
		//Init Method
		public void afterPropertiesSet() throws Exception 
			{
				System.out.println("This is Pepsi Init Method..!!!");
			}
		//Destroy Method
		public void destroy() throws Exception 
			{
				System.out.println("This is pepsi Destroy Method..!!!");
			}
	}
