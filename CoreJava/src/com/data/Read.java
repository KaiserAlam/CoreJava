package com.data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		
		// The name of the file to open.
        String fileName = System.getProperty("user.home") + "/test_data/sample-1512973501535.txt";
        
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName);
            int c = -1;
            while((c = fileReader.read()) > -1 ) {
            		System.out.print((char) c);
            }

        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }
	}
}
