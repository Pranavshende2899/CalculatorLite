package com.calculator;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
public class Calculator {
	
	public void getCalculator() {
		Scanner scanner=new Scanner(System.in);
		ArethmaticOperationimpl arethmaticOperation= new ArethmaticOperationimpl();
		
	System.out.println("Welcome to console based application\n" + 
			"1. Addition of two number\n" + 
			"2. Subtraction of two number\n" + 
			"3. Multiplication of two number\n" + 
			"4. Division of two number\n" + 
			"5. Modulus of two number\n" + 
			"6. Square of number\n" + 
			"7. Cube of number\n" + "8. Average of numbers\n" + 
			"9. Factors of numbers\n" + 
			"10.Find out even or odd number\n"+ "Enter your choice");
		int choice=scanner.nextInt();
		switch (choice) {
		case 1: System.out.println("Enter 1st number");
		double a=scanner.nextDouble();
		System.out.println("Enter 2nd number");
		double b=scanner.nextDouble();
		System.out.println("Addition of two number is " +arethmaticOperation.Addition(a, b));
		break;
		case 2: System.out.println("Enter 1st number");
		double c=scanner.nextDouble();
		System.out.println("Enter 2nd number");
		double d=scanner.nextDouble();
		System.out.println("Substration of two number is " +arethmaticOperation.Substraction(c, d));
		break;
		case 3: System.out.println("Enter 1st number");
		double e=scanner.nextDouble();
		System.out.println("Enter 2nd number");
		double f=scanner.nextDouble();
		System.out.println("Multiplication of two number is " +arethmaticOperation.Multiplication(e, f));
		break;
		case 4: System.out.println("Enter 1st number");
		double g=scanner.nextDouble();
		System.out.println("Enter 2nd number");
		double h=scanner.nextDouble();
		System.out.println("Division of two number is " +arethmaticOperation.Division(g, h));
		break;
		case 5: System.out.println("Enter 1st number");
		double i=scanner.nextDouble();
		System.out.println("Enter 2nd number");
		double j=scanner.nextDouble();
		System.out.println("Modulus of two number is " +arethmaticOperation.Modulus(i, j));
		break;
		case 6: System.out.println("Enter the number");
		double k=scanner.nextDouble();
		System.out.println("Square of number is " +arethmaticOperation.Square(k));
		break;
		case 7: System.out.println("Enter the number");
		double l=scanner.nextDouble();
		System.out.println("Cube of number is " +arethmaticOperation.Cube(l));
		break;
		case 8: System.out.println("Enter the 1st number");
		double m=scanner.nextDouble();
		System.out.println("Enter the 2nd number");
		double n=scanner.nextDouble();
		System.out.println("Enter the 3rd number");
		double o=scanner.nextDouble();
		System.out.println("Enter the 4thnumber");
		double p=scanner.nextDouble();
		System.out.println("Enter the 5th number");
		double q=scanner.nextDouble();
		System.out.println("Average of numbers is " +arethmaticOperation.Average(m, n, o,p, q));
		break;
		case 9: System.out.println("Enter the number");
		double r=scanner.nextDouble();
	    arethmaticOperation.Factor(r);
		break;
		case 10: System.out.println("Enter the number");
		double s=scanner.nextDouble();
		arethmaticOperation.EvenOrOdd(s);
		break;
		
			}
		
		
		
		
	}

}
