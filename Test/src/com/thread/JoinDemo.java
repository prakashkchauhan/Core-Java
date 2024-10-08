/* Decompiler 9ms, total 265ms, lines 17 */
package com.thread;

public class JoinDemo {
   public static void main(String[] args) throws InterruptedException {
      Thread t1 = new Thread();
      Thread t2 = new Thread();
      t1.start();
      t1.join();
      t2.start();
      t2.join();
      System.out.println("Main thread is running");
   }
}
