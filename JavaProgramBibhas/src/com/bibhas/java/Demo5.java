package com.bibhas.java;

class P {
	int x = 122;
}

class W extends P {
	int x = 133;
}

public class Demo5 {
	public static void main(String[] args) {
		P p = new W();
		System.out.println(p.x);
		W w=new W();
		System.out.println(w.x);
	}

}
