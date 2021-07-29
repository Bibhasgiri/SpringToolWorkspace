package com.bibhas.file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("F:\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to javatpoint B";
		byte[] n = s.getBytes();
		bout.write(n);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");

	}
}
