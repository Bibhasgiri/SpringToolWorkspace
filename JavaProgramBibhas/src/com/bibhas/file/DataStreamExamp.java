package com.bibhas.file;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataStreamExamp {
public static void main(String[] args)throws IOException{
	InputStream input=new FileInputStream("F:\\b.txt");
	DataInputStream inst=new DataInputStream(input);
	int count=inst.available();
	byte[] ary=new byte[count];
	
	
}
}
