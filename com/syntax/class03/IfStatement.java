package com.syntax.class03;

public class IfStatement {
public static void main(String[] args) {
  int num1=180;
  int num2=900;
  System.out.println("writing my first if statement");
  if(num1>num2)   {
	  System.out.println("num1 is bigger than num2");//if condition true we will see statement
	  //if condition is false we will not see a statement
  }
      System.out.println("end of if statement");
      
      System.out.println("______________________________________");
      
      int temp=80;
      
      if(temp>=80) {
    	  System.out.println("Im going to the beach");
    	  
      }else {
    	  System.out.println("Im going to hunting");
      }
      
      System.out.println("__________________________________________");
      
      double expectedHours=15;
      double actualHours=20;
      
      if (actualHours>expectedHours) {
    	  System.out.println("You will love the course and you will get a job");
    	 
      }else {
    	  System.out.println("you will not succed");
      }
      
  
  
}
}
