/* Decompiler 4ms, total 336ms, lines 16 */
package com.thread;

class SharedResource {
   public synchronized void consume() throws InterruptedException {
      System.out.println("waiting for producer to produce the message");
      this.wait();
      System.out.println("consumer is done");
   }

   public synchronized void produce() {
      System.out.println("producer is producing the message");
      this.notify();
      System.out.println("Notifying consumer");
   }
}
