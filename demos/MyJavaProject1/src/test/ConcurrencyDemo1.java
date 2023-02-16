package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExecutorService threadPool = Executors.newFixedThreadPool(2);

		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Task1 STARTED");
				for(int i=0; i<10; i++) {
					System.out.println("I am inside task1");
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
		
		
		Runnable task2 = () -> {
				System.out.println("\n\tTask2 STARTED");
				for(int i=0; i<10; i++) {
					System.out.println("\tI am inside task2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("\n\tTask2 ENDED");
			};
			
			Runnable task3 = () -> {
				System.out.println("\t\tTask3 STARTED");
				for(int i=0; i<10; i++) {
					System.out.println("\t\tI am inside task3");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("\t\tTask3 ENDED");
			};
		
		threadPool.execute(task1);
		threadPool.execute(task2);
		threadPool.execute(task3); 	
		
	}

}
