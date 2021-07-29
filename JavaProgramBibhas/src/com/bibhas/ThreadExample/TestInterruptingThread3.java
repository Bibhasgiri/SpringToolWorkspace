package com.bibhas.ThreadExample;

public class TestInterruptingThread3 extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		}catch (InterruptedException e) {
		e.printStackTrace();
		}
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		TestInterruptingThread3 t1=new TestInterruptingThread3();
		t1.start();
		t1.interrupt();
	}

}
