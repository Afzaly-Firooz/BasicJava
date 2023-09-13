package Oops;

class calc {
	int a = 10;
	int b = 5;
	int result;

	public void Add() {
		result = a + b;
		System.out.println("Addition of two number are : " + result);
	}

	public void div() {
		result = a / b;
		System.out.println("divisiton of two number are : " + result);
	}

	public void mul() {
		result = a * b;
		System.out.println("multiplication of two number are : " + result);
	}

	public void sub() {
		result = a - b;
		System.out.println("substraction of two number are : " + result);
	}

}

public class Calculator {

	public static void main(String[] args) {
		calc object = new calc();
		object.mul();
		object.sub();
		object.div();
		object.Add();

	}

}
