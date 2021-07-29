package com.java.conversion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample1 {
public static void main(String[] args)throws Exception {
	String s="07/01/2019";
	Date date=new SimpleDateFormat("dd/MM/yyyy").parse(s);
	System.out.println(date);
	
}
}
