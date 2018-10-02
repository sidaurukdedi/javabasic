package com.sidauruk.dedi.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharacterStreamInput {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		FileInputStream in = null;
		try {
			// Using Real Path in Windows 10
			in = new FileInputStream(
					"D:\\Practice\\Java Wep App\\udemy.com\\JavaBasic\\src\\com\\sidauruk\\dedi\\FileIO\\input.txt");
			int i = 0;
			// while loop
			while ((i = in.read()) != -1) {
				System.out.print((char) i); // Convert(Type casting) to char
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

}
