package com.java.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToStringExample1 {
  public static void main(String[] args) {
	  Date date=Calendar.getInstance().getTime();
	  DateFormat datef=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	  String sd=datef.format(date);
	  System.out.println(sd);
}
}
