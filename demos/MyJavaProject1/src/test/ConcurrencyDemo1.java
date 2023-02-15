package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExecutorService threadPool = Executors.newSingleThreadExecutor();

		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Task1 STARTED");
				for(int i=0; i<10; i++) {
					System.out.println("I am inside thread1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Task1 ENDED");
			}
		};
		
		threadPool.execute(task1);
		
	}

}
