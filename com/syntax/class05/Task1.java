package com.syntax.class05;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		System.out.println("Please enter a day of the week");}
		int weekDay;
		weekDay=user.nextInt();
		
		if(weekDay>=1) {
			System.out.println("It is a weekday");
		}else if(weekDay>=6 && weekDay>=7) {
			System.out.println("It is a weekend");
		
	 }else{
				System.out.println("Invalid");
			}
		}
		


	}


