/* Decompiler 42ms, total 610ms, lines 40 */
package com.fileRead;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadLargeBinaryFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filePath = "C:\\v_prakash\\study\\workspaces\\core java\\Test\\src\\com\\fileRead\\ReadLargeFileUsingStreams.class";

		try (BufferedInputStream br = new BufferedInputStream(new FileInputStream(filePath))) {
			int byteData;
			try {
				while ((byteData = br.read()) != -1) {
					System.out.println(byteData);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
