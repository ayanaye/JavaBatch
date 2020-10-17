package com.syntax.class06;

import java.util.Scanner;

public class taskNotOperation {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		boolean sale;
		System.out.println("Have stores sale?");
		sale=user.nextBoolean();
		
		System.out.println("May i know price?");
		int price;
		int price=nextInt();
		
		if(sale) {
			if(price<50) {
				System.out.println("we offer 10% off");
			if(price>50 && price<100) {
				System.out.println("We offer 20% off");
				if(price>100 && price<500) {
					System.out.println("We offer 40% off");
					if(price>500) {
						System.out.println("We offer 50% off");
					
					}else {
		System.out.println("We are not going to shopping");
					}
				}
			}
		
		
	


