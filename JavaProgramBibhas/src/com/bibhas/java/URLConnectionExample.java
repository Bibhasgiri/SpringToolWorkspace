package com.bibhas.java;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.facebook.com/");
			URLConnection urlcon = url.openConnection();
			InputStream s = urlcon.getInputStream();
			int i;
			while ((i = s.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
