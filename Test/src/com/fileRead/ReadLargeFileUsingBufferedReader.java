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

         try(BufferedReader br = new BufferedReader(fr)) {

            String line;
            
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
         }
      } catch(IOException e) {
    	  e.printStackTrace();
      }
	}
}
