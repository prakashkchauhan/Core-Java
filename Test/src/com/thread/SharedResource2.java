/* Decompiler 27ms, total 360ms, lines 18 */
package com.thread;

class SharedResource2 {
   public void produce() {
      for(int i = 0; i < 200; ++i) {
         System.out.println("Producer is producing record: " + i);
      }

   }

   public synchronized void consume() throws InterruptedException {
      for(int i = 0; i < 200; ++i) {
         System.out.println("Consumer is producing record: " + i);
      }

   }
}
