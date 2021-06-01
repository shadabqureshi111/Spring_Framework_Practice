package springcore.one.demo;

public class Student {
	private int s_id;
	private String s_name;
	private String s_address;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_address() {
		return s_address;
	}

	public void setS_address(String s_address) {
		this.s_address = s_address;
	}



@Override
public String toString() {
	return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_address=" + s_address + "]";
}
}