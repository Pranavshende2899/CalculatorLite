package com.calculator;

public class ArethmaticOperationimpl implements ArethmaticOperation{

	@Override
	public double Addition(double a, double b) {
		return a+b;
	}

	@Override
	public double Substraction(double a, double b) {
		return a-b;
	}

	@Override
	public double Multiplication(double a, double b) {
		return a*b;
	}

	@Override
	public double Division(double a, double b) {
		return a/b;
	}

	@Override
	public double Modulus(double a, double b) {
		return a%b;
	}

	@Override
	public double Square(double a) {
		return a*a;
	}

	@Override
	public double Cube(double a) {
		return a*a*a;
	}

	@Override
	public double Average(double a, double b, double c, double d, double e) {
		return (a+b+c+d+e/5);
	}

	@Override
	public void Factor(double a) {
		for(int i=1;i<=a;i++) {
			if (a%i==0) {
				System.out.print(i+" ");
			}
			
		}

	}

	@Override
	public void EvenOrOdd(double a) {
		if(a%2==0) 
			System.out.println(a+" is even number");
		
		else 
			System.out.println(a+" is odd number");
	
	}

}
