/* Decompiler 4ms, total 294ms, lines 18 */
package com.thread;

import com.thread.CallableTest;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableTest {
   public static void main(String[] args) throws InterruptedException, ExecutionException {
      ExecutorService ex = Executors.newFixedThreadPool(1);
      Future<Integer> test = ex.submit(new Runnable());
      System.out.println(test.get());
      ex.awaitTermination(1L, TimeUnit.MINUTES);
   }
}
