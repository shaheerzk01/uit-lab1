package PROGRAMS;

import java.util.Scanner;

public class PROGRAM3 {
	
	public void display() {
	    System.out.println("Calculating Method execution time:");
	  }

	  public static void main(String[] args) {

	    PROGRAM3 obj = new PROGRAM3();

	    // get the start time
	    long start = System.currentTimeMillis();
	    
	    System.out.println("First program");
	    
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
		
		System.out.println("Second program");
		
        float petrol = 150.30f;
		
		int amount;
		System.out.println("Total no of amount of petrol");
		amount = input.nextInt();
		
		float litre = amount/petrol;
		
		float distance;
		
		System.out.println("Distance you travel from home in km");
		distance = input.nextFloat();
		
		float actual_litre = litre - 10;
		
		float average = distance/actual_litre;
		
		System.out.println("Average of the car is " + average);
		
		float cost = average*petrol;
		
		int parkingtickets;
		
		System.out.println("Any parking tickets you bought if yes press 1 if no press 0");
		parkingtickets = input.nextInt();
		
		if(parkingtickets==1) {
			
			int limit;
			System.out.println("How many parking tickets you purchased");
			limit = input.nextInt();
			int t1  = limit*10;
			float total = cost + t1;
			System.out.println("Total cost is " + total);
			
			int day;
			System.out.println("Days you traveled");
			day = input.nextInt();
			
			float cost_per_day = total/day;
			System.out.println("Cost per day is " + cost_per_day);
			
			
			
		}else {
			System.out.println("Total cost is " + cost);
			int day;
			System.out.println("Days you traveled");
			day = input.nextInt();
			
			float cost_per_day = cost/day;
			System.out.println("Cost per day is " + cost_per_day);
		}
		  
	    // get the end time
	    long end = System.currentTimeMillis();

	    // execution time
	    long execution = end - start;
	    System.out.println("Execution time: " + execution + " miliseconds ");
	  }

}
