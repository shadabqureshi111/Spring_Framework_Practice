package mvc.register.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity(name="register")
public class Register_Entity 
{
	/*
	 * @Column(name="id")
	 * 
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE)
	 */
	private long id;
	private String fname;
	private String lname;
	private String email;
	private String gender;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
 
	private Date date;
    private Address address;
    private List<String> hobby;
    
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private String password;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	/*
	 * public String getCity() { return city; } public void setCity(String city) {
	 * this.city = city; } public String getCountry() { return country; } public
	 * void setCountry(String country) { this.country = country; }
	 */
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Register_Entity [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", gender="
				+ gender + ", date=" + date + ", address=" + address + ", "
						+ "password=" + password + ",hobby="+hobby+"]";
	}
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	
	
	
	
}
