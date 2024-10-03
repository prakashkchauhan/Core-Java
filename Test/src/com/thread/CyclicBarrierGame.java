/* Decompiler 4ms, total 259ms, lines 16 */
package com.thread;

import com.thread.CyclicBarrierGame;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierGame {
   public static void main(String[] args) {
      CyclicBarrier cb = new CyclicBarrier(2, new 1());
      SharedResource3 sr = new SharedResource3(cb);
      Thread t1 = new Thread(sr);
      t1.start();
      Thread t2 = new Thread(sr);
      t2.start();
   }
}
