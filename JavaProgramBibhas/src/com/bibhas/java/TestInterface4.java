package com.bibhas.java;

interface Printable {
	void print();
}

interface Showable extends Printable {
	void show();
}

public class TestInterface4 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		TestInterface4 obj = new TestInterface4();
		obj.print();
		obj.show();
	}

}
