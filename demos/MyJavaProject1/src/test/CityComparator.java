package test;

import java.util.Comparator;

import rop.licenseapp.bo.Employee;

public class CityComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}

}
