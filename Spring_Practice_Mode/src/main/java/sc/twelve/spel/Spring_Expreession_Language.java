package sc.twelve.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spel1")
public class Spring_Expreession_Language 
{
	@Value("#{2+6}")
	private int x;
	
	@Value("#{8>10?true:false}")
	private String y;
	
	@Value("#{2*7}")
	private int z;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "Spring_Expreession_Language [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
}
