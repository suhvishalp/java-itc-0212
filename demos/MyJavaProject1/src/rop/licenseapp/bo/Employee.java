package rop.licenseapp.bo;

import java.util.Objects;

public class Employee {
	
	private int empId;
	private String empName;
	private String city;
	private double salary;
	
	public Employee() {
		System.out.println("Employee object is created");
	}
	
	public Employee(int empId, String empName, String city, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
//	public boolean equals(Object obj) {
//		Employee otherEmp = (Employee) obj;
//		
//		if(this.empId == otherEmp.empId &&
//				this.empName.equals(otherEmp.empName) && 
//				this.city.equals(otherEmp.city) && 
//				this.salary == otherEmp.salary)
//			return true;
//		
//		return false;
//	}
	
	
	
	

}
