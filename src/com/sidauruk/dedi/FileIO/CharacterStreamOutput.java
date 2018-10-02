package com.sidauruk.dedi.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharacterStreamOutput {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			// Using Real Path in Windows 10
			in = new FileInputStream(
					"D:\\Practice\\Java Wep App\\udemy.com\\JavaBasic\\src\\com\\sidauruk\\dedi\\FileIO\\input.txt");
			out = new FileOutputStream(
					"D:\\Practice\\Java Wep App\\udemy.com\\JavaBasic\\src\\com\\sidauruk\\dedi\\FileIO\\output2.txt");
			int i = 0;
			// while loop
			while ((i = in.read()) != -1) {
				out.write((char)i); // write from input.txt to output.txt
//				System.out.print((char) i); // Convert(Type casting) to char
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
