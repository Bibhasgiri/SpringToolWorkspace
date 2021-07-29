package com.bibhas.ThreadExample;

class ThreadNaming extends Thread {
	public ThreadNaming(String name) {
		super(name);

	}

	@Override
	public void run() {
		System.out.println("Thread is Running...........");
	}
}

public class GFG {
	public static void main(String[] args) {
		ThreadNaming t1 = new ThreadNaming("Bibhas");
		ThreadNaming t2 = new ThreadNaming("Giri");
		System.out.println("Thread 1==" + t1.getName());
		System.out.println("Thread 2===" + t2.getName());
		
		t1.start();
		t2.start();
	}
}
