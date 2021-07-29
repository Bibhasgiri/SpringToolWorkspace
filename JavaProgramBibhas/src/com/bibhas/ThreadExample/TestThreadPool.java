package com.bibhas.ThreadExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
   public static void main(String[] args) {
	ExecutorService excutor=Executors.newFixedThreadPool(5);
	for (int i = 0; i <=10; i++) {
		Runnable worker=new WorkerThread(""+i);
		excutor.execute(worker);
	}
	excutor.shutdown();
	while(!excutor.isTerminated()) {}
	System.out.println("Finished all Threads");
}
}
