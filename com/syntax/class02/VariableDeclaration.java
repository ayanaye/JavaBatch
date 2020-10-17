package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 way to declare
		double $num=14.56;
//2 way		
		int myBox;  //declaration
		myBox=123;  // assing value
		System.out.println(myBox);
		
		myBox=155;  //reassign value
		System.out.println(myBox);
//3 way
		int num1, num2, num3;//if variable the same type,all in one line
		num1=29;
		num2=39;
		num3=49;
		
		System.out.println(num3);
		
		//what will be the output?
		char c1='C';
		char c2='D';
		char c3=c1;
		System.out.println(c3); //C
		
		
		
		
		
	}

}
