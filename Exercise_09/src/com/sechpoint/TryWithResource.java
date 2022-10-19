package com.sechpoint;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("")) {
			String msg = "Hello";
			
	        byte byteArray[] = msg.getBytes();
	        
	        fileOutputStream.write(byteArray);
	        
	        System.out.println("Data written successfully!");  
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
