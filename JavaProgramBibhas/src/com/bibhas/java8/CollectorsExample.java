package com.bibhas.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class CollectorsExample {
	public static void main(String[] args) {
		List<Product> p = new ArrayList<Product>();
		p.add(new Product(1, "HP Laptop", 25000f));
		p.add(new Product(2, "Lenovo Laptop", 35000f));
		p.add(new Product(3, "Sony Laptop", 45000f));
		p.add(new Product(4, "Apple Laptop", 65000f));

		List<Float> pp = p.stream().map(x -> x.price).collect(Collectors.toList());
		System.out.print(pp);
	}
}
