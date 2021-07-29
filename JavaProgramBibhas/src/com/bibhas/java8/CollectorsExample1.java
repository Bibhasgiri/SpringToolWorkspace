package com.bibhas.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product1 {
	int id;
	String name;
	float price;

	public Product1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class CollectorsExample1 {
	public static void main(String[] args) {

		List<Product1> p = new ArrayList<Product1>();
		p.add(new Product1(1, "HP Laptop", 25000f));
		p.add(new Product1(2, "Lenovo Laptop", 35000f));
		p.add(new Product1(3, "Sony Laptop", 45000f));
		p.add(new Product1(4, "Apple Laptop", 65000f));
		Set<Float> pp = p.stream().map(x -> x.price).collect(Collectors.toSet());
		System.out.println(pp);
	}
}
