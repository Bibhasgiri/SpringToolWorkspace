package com.bibhas.file;

import java.io.FileOutputStream;

public class FileOutputStreamExampl {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("F:\\testout.txt");
			String s = "Welcome to javatpoint";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Sucess...........");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
