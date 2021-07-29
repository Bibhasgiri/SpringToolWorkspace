package com.javadesignpattern;

public class USA implements Currency {
	
	@Override
	public String getCurrency() {
		return "Dollar";
	}
	public String getSymbol() {
		return"$";
	}
     
}
