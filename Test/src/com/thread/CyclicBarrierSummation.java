/* Decompiler 8ms, total 265ms, lines 24 */
package com.thread;

import com.thread.CyclicBarrierSummation;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierSummation {
   private static int northPopulation = 100;
   private static int southPopulation = 150;
   private static int eastPopulation = 120;
   private static int westPopulation = 130;

   public static void main(String[] args) {
      CyclicBarrier barrier = new CyclicBarrier(4, new 1());
      Thread northThread = new Thread(new com.thread.CyclicBarrierSummation.DirectionTask(barrier, "North"));
      Thread southThread = new Thread(new com.thread.CyclicBarrierSummation.DirectionTask(barrier, "South"));
      Thread eastThread = new Thread(new com.thread.CyclicBarrierSummation.DirectionTask(barrier, "East"));
      Thread westThread = new Thread(new com.thread.CyclicBarrierSummation.DirectionTask(barrier, "West"));
      northThread.start();
      southThread.start();
      eastThread.start();
      westThread.start();
   }
}
