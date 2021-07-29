package com.bibhas.java8;

@FunctionalInterface
interface Drawabl {
	public void draw();
}

public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		int width = 10;
		Drawabl d = new Drawabl() {

			@Override
			public void draw() {
				System.out.println("Drawing " + width);

			}
		};
		d.draw();
	}
}
