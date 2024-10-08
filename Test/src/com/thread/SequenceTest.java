/* Decompiler 9ms, total 284ms, lines 18 */
package com.thread;

public class SequenceTest {
   public static void main(String[] args) throws InterruptedException {
      SharedResource2 sharedResource = new SharedResource2();
      
      Thread t1 = new Thread(new MyThread2(sharedResource));
      Thread t2 = new Thread(new MyThread3(sharedResource));
      
      t1.start();
      t1.join();
      
      t2.start();
      t2.join();
      System.out.println("main thread is completed");
   }
}

class MyThread2 implements Runnable {

	private SharedResource2 sharedResource2;
	
	public MyThread2(SharedResource2 sharedResource2) {
		this.sharedResource2=sharedResource2;
	}

	@Override
	public void run() {
		sharedResource2.produce();
	}
}

class MyThread3 implements Runnable {

	private SharedResource2 sharedResource2;
	
	public MyThread3(SharedResource2 sharedResource2) {
		this.sharedResource2=sharedResource2;
	}

	@Override
	public void run() {
		try {
			sharedResource2.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
