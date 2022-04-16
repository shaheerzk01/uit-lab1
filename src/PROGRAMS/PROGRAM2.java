package PROGRAMS;

import java.util.Scanner;

public class PROGRAM2 {
	
        public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
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
	
		
	}


}
