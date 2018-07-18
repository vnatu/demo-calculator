package com.cglx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculator {

	public Calculator() {
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int substract(int a, int b) {
		int result = a - b;
		return result;
	}

	public int square(int a) {
		int result = a * a;
		return result;
	}
	
	public int remainder(int a, int b)
	{
		return a % b;
	}
	
	public double sqrt(double a) {
		double result = Math.sqrt(a);
		return result;
	}

	
}
