package com.bibhas.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class D {
	int id;
	String name;
	float price;

	public D(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

public class JavaStreamExample1 {
	public static void main(String[] args) {
		List<D> p = new ArrayList<D>();
		p.add(new D(1, "HP2222", 33000));
		p.add(new D(2, "Lenovo", 40000));
		p.add(new D(3, "Sony", 50000));

		List<Float> pl = p.stream().filter(P2 -> P2.price > 30000).map(D::getPrice).collect(Collectors.toList());
		System.out.println(pl);
	}
}
