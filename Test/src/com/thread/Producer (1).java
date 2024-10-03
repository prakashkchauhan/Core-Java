/* Decompiler 9ms, total 407ms, lines 24 */
package com.thread;

class Producer implements Runnable {
   private final SharedBuffer sharedBuffer;

   public Producer(SharedBuffer sharedBuffer) {
      this.sharedBuffer = sharedBuffer;
   }

   public void run() {
      int var1 = 0;

      try {
         while(true) {
            this.sharedBuffer.produce(var1++);
            Thread.sleep(500L);
         }
      } catch (InterruptedException var3) {
         Thread.currentThread().interrupt();
         System.out.println("Producer was interrupted.");
      }
   }
}
