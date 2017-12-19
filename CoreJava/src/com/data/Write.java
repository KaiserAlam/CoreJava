package com.data;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		// The name of the file to open.
        String fileName = System.getProperty("user.home") + "/test_data/sample-1512973501535.txt";
        
        FileWriter fileWriter = new FileWriter(fileName);
        
        fileWriter.write("Hello");
        
        fileWriter.flush();
        fileWriter.close();
	}
}
