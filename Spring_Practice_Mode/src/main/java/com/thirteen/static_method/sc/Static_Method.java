package com.thirteen.static_method.sc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spel1")
public class Static_Method 
{
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int x;
	
	@Value("#{T(java.lang.Math).PI}")
	private String y;
	
	@Value("#{T(java.lang.Math).E}")
	private double z;
	
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
	public double getZ() {
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
