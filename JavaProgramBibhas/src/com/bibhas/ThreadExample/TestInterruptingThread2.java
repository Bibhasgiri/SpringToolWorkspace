package com.bibhas.ThreadExample;

public class TestInterruptingThread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		TestInterruptingThread2 t2 = new TestInterruptingThread2();
		t2.start();
		t2.interrupt();
	}

}
