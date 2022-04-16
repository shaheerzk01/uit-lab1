package PROGRAMS;

import java.util.Scanner;

public class PROGRAM1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Enter number 1");
		number1 = input.nextInt();
		
		System.out.println("Enetr number 2");
		number2 = input.nextInt();
		
		System.out.println("Sum of two number is " + (number1 + number2));
		
		System.out.println("Difference of two number is " + (number1 - number2));
		
		System.out.println("Multiplication " + (number1 * number2));
		
		double Division = number1 / number2;
		System.out.println("Division " + (Division));
		


}

}
