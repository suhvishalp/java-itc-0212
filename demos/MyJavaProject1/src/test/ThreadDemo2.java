package test;

class MyTask implements Runnable {
	
	public void run() {
		System.out.println("T1 STARTED");
		for(int i=0; i<10; i++) {
			System.out.println("I am inside thread1");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("T1 ENDED");
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyTask task1 = new MyTask();
		Thread t1 = new Thread(task1);
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
