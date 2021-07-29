package com.bibhas.java8;

interface Dra {
	int add(int a, int b);
}

public class LambdaExpressionExample5 {
	public static void main(String[] args) {
		Dra d = (a, b) -> (a + b);
		System.out.println(d.add(10, 20));
	}
}
