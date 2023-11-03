package com.assignment1.gl;

import java.util.Scanner;

public class FindValueUsingRecursion {
	public static int power(int x,int n) {
		//base condition
		if(n==0){
			return 1;
		}
		//performing power operation
		int result = x*power(x, n-1);
				return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base number: ");
		int x = sc.nextInt();
		System.out.println("enter the power: ");
		int n = sc.nextInt();
		System.out.println("The answer is : "+power(x, n));
		
		
	}

}
