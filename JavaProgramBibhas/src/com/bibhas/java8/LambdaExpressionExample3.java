package com.bibhas.java8;

interface Say{
	public String say();
}



public class LambdaExpressionExample3 {
  public static void main(String[] args) {
	Say s=()->{
		return "Hello";
	};
	System.out.println(s.say());
}
}
