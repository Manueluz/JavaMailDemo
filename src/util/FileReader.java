package util;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

	public static String fileToString(String file) {
		try(BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
			StringBuilder builder = new StringBuilder();
			
			String line;
			
			while((line = reader.readLine()) != null) {
				builder.append(" " + line);
			}
			
			return builder.toString();
		}catch(IOException e) {
			throw new RuntimeException(e);
		}
	}

}
