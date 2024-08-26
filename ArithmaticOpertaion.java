package Week1Assignment;


public class ArithmaticOpertaion {
	
	public static void main(String[] args) {

		int n1 = 10; // first number
		int n2 = 5; // second number

		char operation = '-'; // operations (+, -, *, /)

		int result = 0;
		boolean validOperation = true;

		if (operation == '+') {
			result = n1 + n2;
			
		} else if (operation == '-') {
			result = n1 - n2;
			
		} else if (operation == '*') {
			result = n1 * n2;
			
		} else if (operation == '/') {
			if (n2 != 0) {
				result = n1 / n2;
				
			} else {
				System.out.println("Error: Division by zero is not allowed.");
				validOperation = false;
			}
		} else {
			System.out.println("Invalid operation.");
			validOperation = false;
		}

		if (validOperation) {
			System.out.println("Result: " + result);
		}
	}
}


