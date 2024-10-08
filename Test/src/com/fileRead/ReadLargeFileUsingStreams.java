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

		try (Stream lines = Files.lines(path)) {
			lines.forEach((line) -> {
				System.out.println(line);
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
