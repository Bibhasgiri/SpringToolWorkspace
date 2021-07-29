package com.bibhas.java;

import java.util.ArrayList;

public class CustomArrayList {

	int n = 4;

	class Data {
		int roll;
		String name;
		int marks;
		long phone;

		public Data(int roll, String name, int marks, long phone) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.phone = phone;
		}
	}

	public static void main(String[] args) {
		int roll[] = { 1, 2, 3, 4 };
		String name[] = { "Subharam", "Bibhas", "Anup", "Anil" };
		int marks[] = { 100, 26, 65, 90 };
		long phone[] = { 329329423, 923874272, 382476294, 871273131 };

		CustomArrayList custom = new CustomArrayList();
		custom.addValues(roll, name, marks, phone);
	}

	public void addValues(int roll[], String name[], int marks[], long phone[]) {
		ArrayList<Data> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Data(roll[i], name[i], marks[i], phone[i]));
		}
		printValue(list);

	}

	public void printValue(ArrayList<Data> list) {
		for (int i = 0; i < n; i++) {
			Data data = list.get(i);
			System.out.println(data.roll + " " + data.name + " " + data.marks + " " + data.phone);

		}

	}
}
