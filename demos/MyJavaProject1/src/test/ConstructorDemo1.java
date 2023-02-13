package test;

import rop.licenseapp.bo.Employee;

public class ConstructorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(101, "Vishal", "Pune", 1000.00);

		System.out.println("EmpId : " + emp1.getEmpId() );
		System.out.println("Emp name : " + emp1.getEmpName() );

		System.out.println("City : " + emp1.getCity() );

		System.out.println("Salary : " + emp1.getSalary() );

	}

}
