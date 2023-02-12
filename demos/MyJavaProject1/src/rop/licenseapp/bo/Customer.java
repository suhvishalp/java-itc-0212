package rop.licenseapp.bo;

public class Customer {

	private  int custId;			//instance variables / members/ properties
	private String firstName;
	private String lastName;
	private String city;
	
	
	public final void someMethod() {
		
	}
	
	public Customer() {
		System.out.println("Customer object created");
		//initialize data members 
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
