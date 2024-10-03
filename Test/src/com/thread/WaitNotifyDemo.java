/* Decompiler 3ms, total 261ms, lines 13 */
package com.thread;

import com.thread.WaitNotifyDemo.1;
import com.thread.WaitNotifyDemo.2;

public class WaitNotifyDemo {
   public static void main(String[] args) {
      SharedResource sharedResource = new SharedResource();
      (new Thread(new 1(sharedResource))).start();
      (new Thread(new 2(sharedResource))).start();
   }
}
