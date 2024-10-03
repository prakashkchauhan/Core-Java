/* Decompiler 34ms, total 546ms, lines 46 */
package com.fileRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadLargeFileUsingStreams {
   public static void main(String[] args) {
      String filePath = "C:\\v_prakash\\study\\workspaces\\core java\\Test\\src\\test.txt";
      Path path = Paths.get(filePath);

      try {
         Throwable var3 = null;
         Object var4 = null;

         try {
            Stream lines = Files.lines(path);

            try {
               lines.forEach((line) -> {
                  System.out.println(line);
               });
            } finally {
               if (lines != null) {
                  lines.close();
               }

            }
         } catch (Throwable var13) {
            if (var3 == null) {
               var3 = var13;
            } else if (var3 != var13) {
               var3.addSuppressed(var13);
            }

            throw var3;
         }
      } catch (IOException var14) {
         var14.printStackTrace();
      }

   }
}
