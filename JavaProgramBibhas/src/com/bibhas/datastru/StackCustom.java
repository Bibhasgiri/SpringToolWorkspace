package com.bibhas.datastru;

public class StackCustom {
	int size;
	int top;
	int arr[];

	public StackCustom(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public int peek() {
		return arr[top];
	}

	public void push(int pushEl) {
		if (!isFull()) {
			top++;
			arr[top] = pushEl;
			System.out.println("Pushed Element " + pushEl);
		} else {
			System.out.println("Stack is Full!");
		}
	}

	public int pop() {

		if (!isEmpty()) {
			int returntop = top;
			top--;
			System.out.println("PoppedElement is " + arr[returntop]);
			return arr[returntop];
		} else {
			System.out.println("Stack is Empty!");
			return -1;
		}
	}

	public static void main(String[] args) {
		StackCustom sc = new StackCustom(10);
		sc.pop();
		System.out.println("===========================");
		sc.push(10);
		sc.push(20);
		sc.push(30);
		sc.push(40);
		sc.push(50);
		System.out.println("==================================");
		sc.pop();
		sc.pop();
		sc.pop();
		System.out.println("===================================");
	}
}
