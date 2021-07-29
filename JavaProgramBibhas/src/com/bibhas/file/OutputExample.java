package com.bibhas.file;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("F://b.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.writeInt(66);
		data.flush();
		data.close();
		System.out.println("Sucess.....");
	}
}
