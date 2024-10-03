/* Decompiler 5ms, total 271ms, lines 12 */
package com.thread;

public class ReentrantLockDemo {
   public static void main(String[] args) {
      SharedBuffer buffer = new SharedBuffer(5);
      Thread producerThread = new Thread(new Producer(buffer));
      Thread consumerThread = new Thread(new Consumer(buffer));
      producerThread.start();
      consumerThread.start();
   }
}
