/* Decompiler 22ms, total 303ms, lines 32 */
package com.interfaceDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
   public static void main(String[] args) {
      Consumer<Integer> consumer = (x) -> {
         System.out.println(x);
      };
      consumer.accept(5);
      Consumer<List<Integer>> modify = (listx) -> {
         for(int i = 0; i < listx.size(); ++i) {
            listx.set(i, 2 * (Integer)listx.get(i));
         }

      };
      Consumer<List<Integer>> dispList = (listx) -> {
         listx.stream().forEach((a) -> {
            System.out.print(String.valueOf(a) + " ");
         });
      };
      List<Integer> list = new ArrayList();
      list.add(2);
      list.add(1);
      list.add(3);
      modify.accept(list);
      dispList.accept(list);
   }
}
