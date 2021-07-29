package com.bibhas.program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDeleteElement {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			int x=(Integer)itr.next();
			if(x<20)
			itr.remove();
		}
		System.out.println("Modified ArrayList" + al);
	}
}
