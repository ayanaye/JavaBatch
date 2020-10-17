package com.syntax.class02;

public class StringConcetanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Olga";
// I would like to say my name is Olga
System.out.println("My name is "+name);

String lastName= "Ivanova";
//I would like to print Olga Ivanova
System.out.println(name+" "+lastName);
	
String city="Miami";
//Olga lives in Miami
System.out.println(name+" "+ "lives in"+" "+ city+".");

 char grade='B';
 //Olga is B student.
 System.out.println(name+" is "+ grade +" student"+".");
 
 int age=21;
 //Olga is 21 years old.
 System.out.println(name+ " is "+age+" years old"+".");
 
 //to attach/concanenate  Any value we use +
 
 int date=27;
 String month="September";
 System.out.println(month +" "+date+"th");
 
 String state="DC";
 String anotherState="DC "; 
 
	}

}
