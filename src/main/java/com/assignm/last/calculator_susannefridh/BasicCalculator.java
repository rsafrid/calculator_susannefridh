package com.assignm.last.calculator_susannefridh;

public class BasicCalculator implements BasicCalculatorInterface {
	
	public double addision(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}


	public double subtraktion(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public double multiplikation(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public double division(double firstNumber, double secondNumber) {
		return firstNumber /secondNumber;
	}
}
