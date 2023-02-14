package test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import rop.licenseapp.bo.Employee;

public class EmployeeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Comparator<Employee> comparator = new CityComparator();
		
//		Comparator<Employee> salComparator = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return (int) (o1.getSalary() - o2.getSalary());
//			}
//			
//		};
		
		Comparator<Employee> salComparator = (o1, o2) ->  (int) (o1.getSalary() - o2.getSalary());

		Set<Employee> empSet = new TreeSet<>(salComparator);
		
		empSet.add(new Employee(101, "Mubarak", "Muscat", 2000.00));
		empSet.add(new Employee(102, "Almotasim", "Nizwa", 6000.00));
		empSet.add(new Employee(103, "Maryam", "Muscat", 5000.00));
		empSet.add(new Employee(104, "Vishal", "Salalah", 4000.00));
		empSet.add(new Employee(105, "AlAzhar", "Nizwa", 3000.00));
		
		System.out.println(empSet);
	}

}
