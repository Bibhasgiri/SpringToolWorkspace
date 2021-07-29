package com.bibhas.java;

interface AA {
	default void msg() {
		System.out.println("Hi");
	}
}

interface BB {
	default void msg() {
		System.out.println("Hello");
	}
}

public class TestClass implements AA, BB {
	public void msg() {
		System.out.println("Bibhas");
		AA.super.msg();
		BB.super.msg();
	}

	public static void main(String[] args) {
		TestClass d = new TestClass();
		d.msg();
	}

}
