package test;

//class MyProduct implements Taxable {
//
//	@Override
//	public void calcTax() {
//		// TODO Auto-generated method stub
//		System.out.println("Calculating tax for the product");
//		//code
//	}
//	
//}


interface Addition{
	public abstract void add(int i);
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
			Taxable taxableProduct1 = new Taxable() {

				@Override
				public void calcTax() {
					System.out.println("Calculating the tax");
				}
				
			};
			
			Taxable taxableProduct2 = ()-> System.out.println("Calculating the tax");

	}

}
