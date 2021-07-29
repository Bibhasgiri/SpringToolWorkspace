package com.bibhas.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product2 {
	int id;
	String name;
	float price;

	public Product2(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class CollectorsExample2 {
	public static void main(String[] args) {
		List<Product2> productsList = new ArrayList<Product2>();
		productsList.add(new Product2(1, "HP Laptop", 25000f));
		productsList.add(new Product2(2, "Dell Laptop", 30000f));
		productsList.add(new Product2(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product2(4, "Sony Laptop", 28000f));
		productsList.add(new Product2(5, "Apple Laptop", 90000f));
		Double averg = productsList.stream().collect(Collectors.averagingDouble(p -> p.price));
		System.out.println("Average Blance "+averg);
	}
}
