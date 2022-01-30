package stack_algoritham;

import java.util.Scanner;
import java.util.Stack;

public class Bracketbalancing {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the expression");
		String value = sc.nextLine();
		String bracketExpression = value;

		if (isBalanced(bracketExpression)) {

			System.out.print("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

	private static boolean isBalanced(String bracketExpression) {

		Stack<Character> stack = new Stack<Character>();

		// iterate through the characters
		for (int i = 0; i < bracketExpression.length(); i++) {

			// check if c is '(' '{' '['
			char character = bracketExpression.charAt(i);

			// push to stack
			if (character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}
			char c;
			// pop from the stack c= ( )
			switch (character) {

			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;

			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;

			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			// in d if it matches with the correct opening bracket then we can pop it.

			}
		}

		return stack.isEmpty();
	}

}
