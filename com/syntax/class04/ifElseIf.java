package com.syntax.class04;

public class ifElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=99;
int num2=99;
if(num1>num2) {
	System.out.println(num1+" is bigger than "+num2);
}else if(num1<num2) {
	System.out.println(num1+" is smaller than "+num2);
} else {
	System.out.println(num1+" is equal to "+num2);
}
	System.out.println("______________________________");
	
	int day=7;
	if(day==1) {
		System.out.println("Today is Monday and i have no class");
} else if(day==2) {
	System.out.println("Today is tuesday and i have manual testing class");
} else if(day==3) {
	System.out.println("Today is wednesday and i have class");
} else if(day==4) {
	System.out.println("I have review class today");
} else if(day==5) {
	System.out.println("Today is Friday and i have no class");
} else if(day==6) {
	System.out.println("Today is coding class and Im exited");
}else if(day==7) {
	System.out.println("today is Sunday i have a lot of homework");
}
	
	}

}
