package com.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {

	public static void main(String[] args) {
		
		// The name of the file to open.
        String fileName = System.getProperty("user.home") + "/test_data/sample-1512973501535.txt";

        // This will reference one line at a time
        String line = null;
        FileReader fileReader = null;

        try {
            // FileReader reads text files in the default encoding.
            fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }
	}
}
