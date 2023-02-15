package test;

import java.util.Scanner;

import rop.licenseapp.bo.Employee;

public class Demo {
	
	public static Employee createEmployee() {
		Scanner scan = new Scanner(System.in);
		
		int empId;
		System.out.println("Enter empId: ");
		empId = scan.nextInt();
		
		String empName;
		System.out.println("Enter EmpName: ");
		empName = scan.next();
		
		String city;
		System.out.println("Enter City: ");
		city = scan.next();
		
		double salary;
		System.out.println("Enter salary: ");
		salary = scan.nextDouble();
		
		
		Employee emp = new Employee(empId, empName, city, salary);
		return emp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = createEmployee();
		
		System.out.println(emp1);

	}

}
