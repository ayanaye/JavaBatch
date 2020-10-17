package com.syntax.class05;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner scan;
		int years;
		double salary;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter number of worked years");
		years=scan.nextInt();
		
		if(years>=5) {
		System.out.println("You are eligible for the bonus!");
		 
		System.out.println("What was your salary?");
		salary=scan.nextDouble();
		if(salary>50000) {
			System.out.println("Your bonus amount is 5000!");
		}else {
			System.out.println("Your bonus amount is 3000");
		 }
	    }
	     else{
		System.out.println("We are sorry, you are not eligible for the bonus");
			
		}
			
		}
		
		
	
	}
	


