/* Decompiler 11ms, total 343ms, lines 18 */
package com.interfaceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
   public static void main(String[] args) {
      Predicate<Integer> greaterCheck = (x) -> {
         return x > 100;
      };
      List<Integer> list = Arrays.asList(100, 200, 300);
      List<Integer> finalList = (List)list.stream().filter(greaterCheck).collect(Collectors.toList());
      System.out.println(finalList);
   }
}
