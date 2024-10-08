/* Decompiler 12ms, total 250ms, lines 8 */
package com.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//No need to provide the time
public class CyclicBarrierDemo {
   public static void main(String[] var0) throws InterruptedException, BrokenBarrierException {
	   
	   CyclicBarrier barrier = new CyclicBarrier(3, () -> {
		   System.out.println("Reaching barrier");
	   });
	   
	    Thread t1 = new MyThread5(barrier,1000);
		t1.start();
		Thread t2 = new MyThread5(barrier,1000);
		t2.start();
		Thread t3 = new MyThread5(barrier,1000);
		t3.start();
   }
}

class MyThread5 extends Thread {

	private CyclicBarrier barrier;
	private long duration;
	
	public MyThread5(CyclicBarrier barrier, long duration) {
		this.barrier=barrier;
		this.duration=duration;
	}
	
	@Override
	public void run() {
		System.out.println("Before barrier: "+Thread.currentThread().getName());
		
		try {
			barrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		
		//System.out.println("After barrier: "+Thread.currentThread().getName());
		System.out.println("All plyers have joined lets start the game  or  "
				+ "all players has finished first level now moving to next level");
		
	}
}
