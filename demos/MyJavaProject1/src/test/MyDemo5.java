package test;



class MyThread extends Thread {
	
	public void run() {
		System.out.println("T1 STARTED");
		for(int i=0; i<10; i++) {
			System.out.println("I am inside thread1");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("T1 ENDED");
	}
}

public class MyDemo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("This is my main program");
		System.out.println(Thread.currentThread());
		
		MyThread t1 = new MyThread();
		t1.start();
		
		System.out.println("\n\t Main STARTED");

		for(int i=0; i<10; i++) {
			System.out.println("\n\t I am main thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		t1.join();
		
		System.out.println("\n\t Main ENDED");
	}

}
