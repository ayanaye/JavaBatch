package com.syntax.class04;

public class nestedIf {
public static void main(String[] args) {
	 boolean holiday=false;
	 int date=31;
	 if(holiday) {
		 System.out.println("its day off today");
		 if(date==31) {
			 System.out.println("Today im going to buy presents");
}else {
	System.out.println("Ill stay home and have some rest");
}
	 }else {
		 System.out.println("Today is not a holiday and I have to work");
	 }
}
}
