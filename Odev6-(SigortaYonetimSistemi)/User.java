import java.util.ArrayList;
import java.util.Date;

public class User {

	private String name;
	private String surname;
	private String email;
	private String password;
	private String job;
	private int age;
	private ArrayList<Address> addressList;
	private Date lastLoging;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public ArrayList<Address> getAddressList() {
		return addressList;
	}
	
	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
	}
	
	public Date getLastLoging() {
		return lastLoging;
	}
	
	public void setLastLoging(Date lastLoging) {
		this.lastLoging = lastLoging;
	}
	
}
