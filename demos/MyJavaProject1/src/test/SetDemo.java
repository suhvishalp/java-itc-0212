package test;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> names = new TreeSet<>();
		
		names.add("Maryam");
		names.add("Mubarak");
		names.add("AlAzhar");
		names.add("Mohammed");
		names.add("Hafedh");
		names.add("Almotasim");
		
		names.add("Mohammed");
		names.add("Hafedh");
		
		System.out.println(names);
		
	}

}
