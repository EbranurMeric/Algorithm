package Practices;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {

	public static void main(String[] args) {
		String expr = "3 4 + 2 * 7 /"; // ((3+4)*2)/7
		System.out.println(postfixEvaluate(expr)); // Çıktı: 2
	}


	public static int postfixEvaluate(String expression) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner input = new Scanner(expression);
		while (input.hasNext()) {
			if (input.hasNextInt()) { // an operand (integer)
				s.push(input.nextInt());
			} else { // an operator
				String operator = input.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator.equals("+")) {
					s.push(operand1 + operand2);
				} else if (operator.equals("-")) {
					s.push(operand1 - operand2);
				} else if (operator.equals("*")) {
					s.push(operand1 * operand2);
				} else {
					s.push(operand1 / operand2);
				}
			}
		}
		return s.pop();

	}

}
