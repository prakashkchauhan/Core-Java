/* Decompiler 10ms, total 347ms, lines 11 */
package com.thread;

public class ReentrantLockDemo2 {
   public static void main(String[] args) {
      SharedBuffer2 sharedResource = new SharedBuffer2(5);
      Thread producer = new Thread(new Producer2(sharedResource));
      new Thread(new Producer2(sharedResource));
      producer.start();
   }
}
