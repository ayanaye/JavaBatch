package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		System.out.println("Please enter you height");
		int height;
		height=user.nextInt();
		
		if(height<60) {
			System.out.println("short");
		}else if(height>=60 && height<=72) {
			 System.out.println("medium");
		 }else if(height>72) {
			 System.out.println("tall");
		 }
		else {
			System.out.println("Invalid");
		

	}

	}
}