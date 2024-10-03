/* Decompiler 23ms, total 276ms, lines 13 */
package com.interfaceDemo;

import com.interfaceDemo.RunnableDemo.1;

public class RunnableDemo {
   public static void main(String[] args) {
      (new Thread(new 1())).start();
      (new Thread(() -> {
         System.out.println("test2");
      })).start();
   }
}
