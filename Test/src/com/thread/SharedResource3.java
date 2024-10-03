/* Decompiler 12ms, total 338ms, lines 24 */
package com.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class SharedResource3 implements Runnable {
   private final CyclicBarrier cb;

   public SharedResource3(CyclicBarrier cb) {
      this.cb = cb;
   }

   public void run() {
      System.out.println(Thread.currentThread().getName() + " has joined.");

      try {
         this.cb.await();
      } catch (BrokenBarrierException | InterruptedException var2) {
         var2.printStackTrace();
      }

   }
}
