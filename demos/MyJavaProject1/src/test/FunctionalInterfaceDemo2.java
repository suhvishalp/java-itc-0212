package test;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {
		
		int[] numbers = {32,35,33,1,54,4,22,56,22,53,12,54,67,43,2,4,5,3,6,7,8};
		
//		Predicate<Integer> predicate1 = new Predicate<>() {
//
//			@Override
//			public boolean test(Integer item) {
//				if(item%2==0)
//					return true;
//				
//				return false;
//			}
//		};
		
		Predicate<Integer> predicate1 = item -> item%2==0;
		showNumbers(numbers, predicate1);
		
		System.out.println("-----");
		Predicate<Integer> predicate2 = item -> item <= 10;
		showNumbers(numbers, predicate2);
		
		System.out.println("-----");
		Predicate<Integer> combinedPredicate = predicate1.and(predicate2);
		showNumbers(numbers, combinedPredicate);
		
	}
	
	public static void showNumbers(int[] numbers, Predicate<Integer> predicate) {
		for(int value : numbers) {
			if(predicate.test(value))
				System.out.print(value + " ");
		}
	}
	
	


}
