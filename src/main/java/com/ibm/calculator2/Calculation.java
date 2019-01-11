package com.ibm.calculator2;

import java.util.Scanner;


public class Calculation {
	
	
	
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b= sc.nextInt();
	int c = sc.nextInt();
	

	public static void main(String[] args) {
		System.out.println("\n enter the variables");
		System.out.println("\n enter your choice of calculation");
		System.out.println("\n 1 for addition");
		System.out.println("\n 2 for mutltiplication\n");
		Calculation calobj = new Calculation();
		
		int a =calobj.a;
		int b = calobj.b;
		
		int c= calobj.c;
		
		switch(c)
		{
		case 1:
			int out=a+b;
			System.out.println("tha additional value of " +out);
			break;
		case 2:
			int out2=a*b;
			System.out.println("the multiplication value is" + out2);
			break;
			default:
				System.out.println("give the proper calculation option ");
		}
		

	}

}
