package com.intro;
import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int userInput;
		System.out.println("Enter a number:");
		userInput=sc.nextInt();
		System.out.println("You Entered the value is:"+userInput);
		long marks;
		marks=sc.nextLong();
		System.out.println("Your age is:"+marks);
		sc.close();
	}

}
