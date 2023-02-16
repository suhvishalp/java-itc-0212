package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numsList  = new LinkedList<>();
		
		numsList.add(10);
		numsList.add(40);
		numsList.add(43);
		numsList.add(653);
		numsList.add(43);
		numsList.add(400);
		
		numsList.add(1, 100);	
		
		numsList
			.stream()
			.forEach(item -> System.out.println(item));
		
		
		
		
		
		
		
		
//		Collections.shuffle(numsList);
		
//		Collections.sort(numsList);

//		System.out.println(numsList);
		
//		System.out.println(numsList.get(3));
		
//		for(Integer item : numsList) {
//			System.out.println(item);
//		}
	}

}
