package ControlStmt;

import java.util.Scanner;

public class Switchtest {

	public static void main(String[] args) {
		int a,b,c;
		String opr;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first no");
		a= sc.nextInt();
		System.out.println("enter the second no");
		b= sc.nextInt();
		System.out.println("Enter your operator");
		opr=sc.next();
		switch(opr) {
		case "+":
			c=a+b;
			System.out.println("the sum is"+c);
			break;
		case "-":
			c=a-b;
			System.out.println("sum of two number is"+c);
			break;
		case "/":
			c=a/b;
			System.out.println("Division of two number is"+c);
			break;
		case "*":
			c=a*b;
			System.out.println("Multiplicaiton of two number is"+c);
			break;
			default:
				System.out.println(" operator is Out range");
		
		}
		
		
		

	}

}
