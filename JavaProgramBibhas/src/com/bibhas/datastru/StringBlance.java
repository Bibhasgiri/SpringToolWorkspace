package com.bibhas.datastru;

import java.util.Stack;

public class StringBlance {

	public static boolean balParenthesis(String exp) {
		Stack<Character> stack = new Stack();
		for (char c : exp.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			if (c == ')' || c == '}' || c == ']') {
				if (stack.empty()) {
					return false;
				}
				Character top = stack.pop();
				if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')) {
					return false;
				}
			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		String exp = "{())}[{}]";

		if (balParenthesis(exp)) {
			System.out.println("The expression is balanced");
		} else {
			System.out.println("The expression is not balanced");
		}
	}
}
