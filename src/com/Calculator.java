package com;

import java.util.Scanner;

class Cal {
	static int add(int a, int b) {

		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int mul(int a, int b) {
		return a * b;
	}

	static double div(int a, int b) {
		return a / b;
	}
}

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Select the Oparation");
		System.out.println("1 : add\n2 : sub\n3 : mul\n4 : div");
		int chose = sc.nextInt();
		System.out.println("Enter num1");
		int a = sc.nextInt();
		System.out.println("Enter num2");
		int b = sc.nextInt();
		switch (chose) {
		case 1:
			System.out.println(Cal.add(a, b));
			break;
		case 2:
			System.out.println(Cal.sub(a, b));
			break;
		case 3:
			System.out.println(Cal.mul(a, b));
			break;
		case 4:
			System.out.println(Cal.div(a, b));
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
	}

}
