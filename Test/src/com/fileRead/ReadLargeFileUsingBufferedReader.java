/* Decompiler 55ms, total 417ms, lines 46 */
package com.fileRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFileUsingBufferedReader {
   public static void main(String[] args) throws FileNotFoundException {
      String path = "C:\\v_prakash\\study\\workspaces\\core java\\Test\\src\\test.txt";
      FileReader fr = new FileReader(path);

      try {
         Throwable var3 = null;
         Object var4 = null;

         try {
            BufferedReader br = new BufferedReader(fr);

            String line;
            try {
               while((line = br.readLine()) != null) {
                  System.out.println(line);
               }
            } finally {
               if (br != null) {
                  br.close();
               }

            }
         } catch (Throwable var14) {
            if (var3 == null) {
               var3 = var14;
            } else if (var3 != var14) {
               var3.addSuppressed(var14);
            }

            throw var3;
         }
      } catch (IOException var15) {
         var15.printStackTrace();
      }

   }
}
