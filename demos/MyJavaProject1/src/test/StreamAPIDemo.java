package test;

import java.util.ArrayList;
import java.util.List;

import rop.licenseapp.bo.Student;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> listStudents = new ArrayList<>();
		
		listStudents.add(new Student("Alice", 82));
		listStudents.add(new Student("Bob", 90));
		listStudents.add(new Student("Carol", 67));
		listStudents.add(new Student("David", 80));
		listStudents.add(new Student("Eric", 55));
		listStudents.add(new Student("Frank", 49));
		listStudents.add(new Student("Gary", 88));
		listStudents.add(new Student("Henry", 98));
		listStudents.add(new Student("Ivan", 66));
		listStudents.add(new Student("John", 52));
		
		
		
		listStudents.stream()
			.filter(student -> student.getScore() >= 70)
			.sorted()
			.limit(2)
			.forEach(s -> System.out.println(s));
		

	}

}
