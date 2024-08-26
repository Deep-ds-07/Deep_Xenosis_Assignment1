package Week1Assignment;

import java.util.Scanner;

public class BasicCalculater {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("<<<<<This is the small Calculater of two Numbers>>>>>");

		System.out.print("Enter the first number: ");
		int Firstnum = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int Secondnum = scanner.nextInt();

		System.out.println("1. For Addition (+)");
		System.out.println("2. For Substraction (-)");
		System.out.println("3. For Multiplication (*)");
		System.out.println("4. For Division (/)");

		System.out.print("Enter the Number For Operation(1,2,3,4): ");

		char operation = scanner.next().charAt(0);

		int result;

		switch (operation) {

		case '1':
			result = Firstnum + Secondnum;
			System.out.println("Yours Addition is : " + result);
			break;
		case '2':
			result = Firstnum - Secondnum;
			System.out.println("Yours Subtraction is : " + result);
			break;
		case '3':
			result = Firstnum * Secondnum;
			System.out.println("Yours Multiplication is : " + result);
			break;
		case '4':
			if (Secondnum != 0) {
				result = Firstnum / Secondnum;
				System.out.println("Yours Division is : " + result);
			} else {
				System.err.println("ERROR : Division by zero is not allowed.");
			}
			break;

		default:
			System.err.println("ERROR : Invalid Selection, Please choose correct one.");
			break;
		}

		scanner.close();
	}
}
