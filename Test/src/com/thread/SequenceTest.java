/* Decompiler 9ms, total 284ms, lines 18 */
package com.thread;

import com.thread.SequenceTest.1;
import com.thread.SequenceTest.2;

public class SequenceTest {
   public static void main(String[] args) throws InterruptedException {
      SharedResource2 sharedResource = new SharedResource2();
      Thread t1 = new Thread(new 1(sharedResource));
      Thread t2 = new Thread(new 2(sharedResource));
      t1.start();
      t1.join();
      t2.start();
      t2.join();
      System.out.println("main thread is completed");
   }
}
