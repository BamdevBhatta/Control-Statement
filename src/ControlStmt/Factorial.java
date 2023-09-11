package ControlStmt;

import java.util.Scanner;
/*
 WAP to find the factorial of given number and if num<0 print factorial 1...
 */
public class Factorial {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n,f=1;
		System.out.println("Enter a number");
		n=sc.nextInt();
		
		while(n>1) {
			f=f*n;
			n--;
		}
		System.out.println("Factorial is "+f);
		
	}
}
