package com.exercise16mathclass.app;
import java.lang.Math;
import java.util.Scanner;

public class MathematicalOperation 
{

	
	
	public static void main(String[] args) 
	{
		double number =3.5;
		double number2 =5.5;
		Scanner input= new Scanner(System.in);
		
		System.out.println("e Value: "+Math.E);
		System.out.println("e Value: "+Math.PI);
		System.out.println("Absolute value of -2.5 is "+Math.abs(-2.15));
		System.out.println("The cube root of 27 is "+Math.cbrt(27));
		System.out.println("The round of 3.76 "+Math.round(number));
		System.out.println("The round ceil of 3.76 "+Math.ceil(number));
		System.out.println("The round floor of 3.76 "+Math.floor(number));
		System.out.println("increment of 5 is "+Math.incrementExact(5));
		System.out.println("Decrement of 5 is "+Math.decrementExact(5));
		System.out.println("Power value of 3 euler is "+Math.exp(3));
		System.out.println(String.format("Which is bigger? %f or %f : %f",number,number2,Math.max(number, number2)));
		System.out.println(String.format("Which is smaller? %f or %f : %f",number,number2,Math.max(number, number2)));
		System.out.println("Sin of 0 degrees is: "+Math.sin(0));
		System.out.println("Sin of PI/2 degrees is: "+Math.sin(Math.PI/2));
		System.out.println("Cos of 0 degrees is "+Math.cos(0));
		System.out.println("Cos of PI/2 degrees is: "+Math.cos(Math.PI/2));
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Input a number: ");
			number = input.nextDouble();
			System.out.println("The Square of " +number+" is "+Math.pow(number, 2));
		}
		int cont=0;
		do
		{
			cont++;
		}while(cont<5);
		
	}

}
