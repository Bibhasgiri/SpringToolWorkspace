package com.bibhas.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Produc {
	int id;
	String name;
	float price;

	public Produc(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Produc> product = new ArrayList<Produc>();
		product.add(new Produc(1, "Hp", 2500f));
		product.add(new Produc(2, "Lenovo", 3500f));
		product.add(new Produc(3, "HCL", 5500f));
		product.add(new Produc(4, "APPle", 55500f));
		List<Float> pp = product.stream().filter(p -> p.price > 3000).map(p -> p.price).collect(Collectors.toList());
		System.out.println(pp);

	}
}
