package ControlStmt;

import java.util.Scanner;

public class Assigment2 {
public static void main(String[] args) {
	String post;
	float total;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the post of Employee");
	post =sc.next();
	switch(post) {
	case "MD":
		total=400000+((400000*18)/100);
		System.out.println("Salary of MD is:"+total);
		break;
	case "CEO":
		total =(float) (300000+((300000*27.90)/100));
		System.out.println("Salary of CEO:"+total);
		break;
	case "MANAGER":
		total=(float) (200000+(200000*13.76)/100);
		System.out.println("Salary of MANAGER:"+total);
		break;
	case "PROGRAMMER":
		total=500000+(500000*25)/100;
		System.out.println("Salary of PROGRAMMER: "+total);
	}
	
}
}
