package com.thread;

import java.util.concurrent.CountDownLatch;

//Note second waiting is required, without which it won't work
public class CountDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {

		CountDownLatch latch = new CountDownLatch(3);
		
        Thread t1 = new MyThread4(latch,1000);
		t1.start();
		Thread t2 = new MyThread4(latch,1000);
		t2.start();
		Thread t3 = new MyThread4(latch,1000);
		t3.start();
        
		latch.await();
		
		System.out.println("main thread is resuming");
	}

}

class MyThread4 extends Thread {

	private CountDownLatch latch;
	private long duration;
	
	public MyThread4(CountDownLatch latch, long duration) {
		this.latch=latch;
		this.duration=duration;
	}
	
	@Override
	public void run() {
		System.out.println("Executing MyThread4 class"+Thread.currentThread().getName());
		
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
		
	}
}
