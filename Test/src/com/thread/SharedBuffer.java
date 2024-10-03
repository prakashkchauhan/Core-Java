/* Decompiler 51ms, total 930ms, lines 61 */
package com.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedBuffer {
   private final Queue<Integer> buffer = new LinkedList();
   private final int capacity;
   private final Lock lock = new ReentrantLock();
   private final Condition bufferNotFull;
   private final Condition bufferNotEmpty;

   public SharedBuffer(int capacity) {
      this.bufferNotFull = this.lock.newCondition();
      this.bufferNotEmpty = this.lock.newCondition();
      this.capacity = capacity;
   }

   public void produce(int value) throws InterruptedException {
      this.lock.lock();

      try {
         while(this.buffer.size() == this.capacity) {
            System.out.println("Buffer is full. Producer is waiting...");
            this.bufferNotFull.await();
         }

         this.buffer.add(value);
         System.out.println("Produced: " + value);
         this.bufferNotEmpty.signal();
      } finally {
         this.lock.unlock();
      }

   }

   public int consume() throws InterruptedException {
      this.lock.lock();

      int var3;
      try {
         while(this.buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            this.bufferNotEmpty.await();
         }

         int value = (Integer)this.buffer.poll();
         System.out.println("Consumed: " + value);
         this.bufferNotFull.signal();
         var3 = value;
      } finally {
         this.lock.unlock();
      }

      return var3;
   }
}
