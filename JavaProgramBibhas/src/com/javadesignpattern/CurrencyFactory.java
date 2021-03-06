package com.javadesignpattern;

public class CurrencyFactory {
	public static Currency getCurrencyByCountry(String cnty) throws Exception {
		if ("IN".equalsIgnoreCase(cnty)) {
			return new India();
		} else if ("USA".equalsIgnoreCase(cnty)) {
			return new USA();
		}
		throw new Exception("Invalid Country");
	}

	public static void main(String[] args) {
		Currency india;
		try {
			india = CurrencyFactory.getCurrencyByCountry("USA");
			System.out.println("India Currency " + india.getCurrency());
			System.out.println("India currency symbol " + india.getSymbol());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
