package com.syntax.class03;

public class CompaundOperators {
public static void main(String[] args) {
	int num=100;
	num=num+10;
	System.out.println(num);
	num=num+200;
	System.out.println(num);
	
	int myNum=100;
	myNum+=10;
	System.out.println(myNum);//110
	myNum+=200;
	System.out.println(myNum);//310
	myNum-=100;
	System.out.println(myNum);//210
	myNum/=10;
	System.out.println(myNum);//21
	myNum*=1000;
	System.out.println(myNum);//21000
	myNum%=100;
	System.out.println(myNum);//0
	
	int num1;
	num1=10;
	num1+=100;
	System.out.println(num1);//110
	num1-=67;
	System.out.println(num1);//43
	
	int cakePiece;
	cakePiece=11;
	System.out.println(cakePiece/4);
	cakePiece=25;
	System.out.println(cakePiece%7);
	
	
	
	
	
}
}
