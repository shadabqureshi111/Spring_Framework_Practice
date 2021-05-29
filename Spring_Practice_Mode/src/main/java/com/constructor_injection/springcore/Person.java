package com.constructor_injection.springcore;

import java.util.List;

public class Person 
	{
		private int p_id;
		private String p_name;
		public Certi certi;
		public List<String> list;
		public Person(int p_id, String p_name,Certi certi,List<String> list) 
		{
			this.p_id = p_id;
			this.p_name = p_name;
			this.certi=certi;
			this.list =list;
		}

		@Override
		public String toString() {
			return "[p_id=" + this.p_id + ",\n p_name=" + this.p_name + ",Certi = "+this.certi+""
					+ ""+this.list+"]";
		}
	
		
	}
