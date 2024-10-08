/* Decompiler 3ms, total 261ms, lines 13 */
package com.thread;

public class WaitNotifyDemo {
   public static void main(String[] args) throws InterruptedException {
//      SharedResource sharedResource = new SharedResource();
//      MyThreadOne myThreadOne = new MyThreadOne(sharedResource);
//      MyThreadTwo myThreadTwo = new MyThreadTwo(sharedResource);
//      ExecutorService executor = Executors.newFixedThreadPool(2);
//      
//      executor.submit(myThreadOne);
//      executor.submit(myThreadTwo);
//      System.out.println("Main thread is resuming");
      
      
      SharedResource sharedResource = new SharedResource();
      Thread t1 = new Thread(new MyThreadOne(sharedResource));
      Thread t2 = new Thread(new MyThreadTwo(sharedResource));
      
      t1.start();
      //t1.join();
      
      t2.start();
      //t2.join();
      
   }
}

class MyThreadOne implements Runnable {
	private SharedResource sharedResource;
	
	public MyThreadOne(SharedResource sharedResource) {
		this.sharedResource=sharedResource;
	}
	
	@Override
	public void run() {
		try {
			sharedResource.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThreadTwo implements Runnable {
	private SharedResource sharedResource;
	
	public MyThreadTwo(SharedResource sharedResource) {
		this.sharedResource=sharedResource;
	}
	
	@Override
	public void run() {
		sharedResource.produce();
	}
}
