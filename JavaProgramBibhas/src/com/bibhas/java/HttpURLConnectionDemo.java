package com.bibhas.java;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpURLConnectionDemo {
  public static void main(String[] args) {
	try {
		URL url =new URL("https://www.javatpoint.com/java-http-url-connection");
		HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
		for (int i =1; i <8; i++) {
			System.out.println(huc.getHeaderField(i)+"= "+huc.getHeaderField(i));
		}
		huc.disconnect();
		
	} catch (Exception e) {
		
	}
}
}
