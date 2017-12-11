package com.data;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Prog1 {

	public static void main(String[] args) {
		
		Date d = new Date();

		File f = new File(System.getProperty("user.home"), "/test_data/sample-" + d.getTime() + ".txt");
		
		if(!f.exists()) {
			
			// Creating Directory
			f.getParentFile().mkdirs();

			// Creating file
			try {
				f.createNewFile();
				System.out.println("File created successfully. Filename: " + f.getName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("File already exist !!!");
			System.out.println(f.getName());
		}
	}
}
