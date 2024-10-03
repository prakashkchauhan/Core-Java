/* Decompiler 13ms, total 267ms, lines 14 */
package com.interfaceDemo;

public class SummationMain {
   public static void main(String[] args) {
      int x = 2;
      int y = 3;
      Summation summation = (p, q) -> {
         return p + q;
      };
      int total = summation.sum(x, y);
      System.out.println(total);
   }
}
