/* Decompiler 35ms, total 294ms, lines 22 */
package com.thread;

class Consumer implements Runnable {
   private final SharedBuffer sharedBuffer;

   public Consumer(SharedBuffer sharedBuffer) {
      this.sharedBuffer = sharedBuffer;
   }

   public void run() {
      try {
         while(true) {
            this.sharedBuffer.consume();
            Thread.sleep(1000L);
         }
      } catch (InterruptedException var2) {
         Thread.currentThread().interrupt();
         System.out.println("Consumer was interrupted.");
      }
   }
}
