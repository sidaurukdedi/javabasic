package com.sidauruk.dedi.FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ByteStreamInput {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		FileReader in = null;
		try {
			// Using Real Path in Windows 10
			in = new FileReader("D:\\Practice\\Java Wep App\\udemy.com\\JavaBasic\\src\\com\\sidauruk\\dedi\\FileIO\\input.txt");
			int i = 0;
			// while loop
			while ((i = in.read()) != -1) {
				System.out.print((char)i); // Convert(Type casting) to char
			}
		} finally {
			if (in != null){
				in.close(); 
			}
		}
	}
}
