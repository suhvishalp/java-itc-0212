package test;

public class OverloadingDemo {

	public static void arithAdd(int a, int b) {
		int sum = a + b;
		System.out.println("method 1 : sum = " + sum);
	}
	
	public static void arithAdd(int a, double b) {
		double sum = a + b;
		System.out.println("method 2 : sum = " + sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		byte y = 1;
		
		arithAdd(x,y);
	}

}
