package com.syntax.class03;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=15;
System.out.println(a>b);//false
System.out.println(a<b);//true
System.out.println(a==b);//false
System.out.println(a!=b);//true

int x=100;
int y=90;

boolean result=x>y;
System.out.println(result);//true

result=x==y;
System.out.println(result);//false

System.out.println(x==y);//compare-boolean
System.out.println(x=y);//assigning value to variable x//90

boolean result1=x==y;
System.out.println(result1);//true

byte num=10;
byte num1=11;
boolean boo=num>num1;
System.out.println(boo);//false

byte num2=10;
byte num3=10;
boolean boo1=num2>=num3;
System.out.println(boo1);//true



		
	}

}
