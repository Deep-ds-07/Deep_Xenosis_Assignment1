package Week1Assignment;

import java.util.Scanner;

public class EvenOddNumbers {


    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your number to check Even or Odd: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
        	
            System.out.println(number +"  "+ "Enter number is even.");
        } else {
            System.out.println(number +"  "+ "Enter number is odd.");
        }

        // Close the scanner
        scanner.close();
    }
}



