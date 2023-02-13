package test;

import rop.licenseapp.bo.Employee;

public class CompareObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(101, "Vishal", "Pune", 1000.00);
		Employee emp2 = new Employee(101, "Vishaddfdl", "Pune", 1000.00);
	
		
		System.out.println(emp1.equals(emp2));
	
	}

}
