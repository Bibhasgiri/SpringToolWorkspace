package com.bibhas.ThreadExample;

public class ThreadGroupDemo implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadGroupDemo runnable=new ThreadGroupDemo();
		
	}

}
