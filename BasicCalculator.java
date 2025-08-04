package calculator;

import java.util.Scanner;

public class BasicCalculator {
	
	public static double add(double a, double b)
	{
		return a+b;
	}
	
	public static double sub(double a, double b)
	{
		return a-b;
	}
	
	public static double mul(double a,double b)
	{
		return a*b;
	}
	
	public static double div(double a, double b)
	{
		if(b==0)
		{
			System.out.println("division bt zero is not allowed");
			return Double.NaN;
		}
		
		return a/b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean continueCalc=true;
		
		System.out.println("=====Basic Calculator=====");
		
		while(continueCalc)
		{
			System.out.println("\nChoose operation:");
			System.out.println("1.Addition(+)");
			System.out.println("2.Substraction(-)");
			System.out.println("3.Multiplication(*)");
			System.out.println("4.Division(/)");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice(1-5)");
			int choice=sc.nextInt();
			
			if(choice==5)
			{
				continueCalc=false;
				System.out.println("Existing calculator.GoodBye!");
				break;
			}
			
			System.out.println("Enter first number:");
			double num1=sc.nextDouble();
			System.out.println("Enter second number:");
			double num2=sc.nextDouble();
			
			double result=0;
			
			switch(choice)
			{
			case 1:
				result=add(num1, num2);
				System.out.println("Result :" +result);
				break;
				
			case 2:
				result=sub(num1, num2);
				System.out.println("Result:" +result);
				break;
				
			case 3:
				result=mul(num1, num2);
				System.out.println("Result :" +result);
				break;
				
			case 4:
				result=div(num1, num2);
				if(!Double.isNaN(result))
				{
				System.out.println("Result :" +result);
				}
				
				break;
				
			default:
				System.out.println("Invalid choice.");
				
			}
		}
		
		sc.close();
		}
	

}
