/* Decompiler 11ms, total 262ms, lines 17 */
package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;

class MyThread implements Callable {
   private final CyclicBarrier cb;

   public MyThread(CyclicBarrier cb) {
      this.cb = cb;
   }

   public Object call() throws Exception {
      return null;
   }
}
