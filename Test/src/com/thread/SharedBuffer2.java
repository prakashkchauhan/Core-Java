/* Decompiler 25ms, total 376ms, lines 40 */
package com.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedBuffer2 {
   private int capacity;
   private final Lock lock = new ReentrantLock();
   private final Queue<Integer> buffer = new LinkedList();
   private final Condition bufferFull;
   private final Condition bufferEmpty;

   public SharedBuffer2(int capacity) {
      this.bufferFull = this.lock.newCondition();
      this.bufferEmpty = this.lock.newCondition();
      this.capacity = capacity;
   }

   public void produce(int value) throws InterruptedException {
      this.lock.lock();

      try {
         while(this.buffer.size() == this.capacity) {
            System.out.println("Buffer is full... Producer is waiting ");
            this.bufferFull.await();
         }

         this.buffer.add(value);
         System.out.println("Produced value: " + value);
         this.bufferEmpty.signal();
      } finally {
         this.lock.unlock();
      }

   }
}
