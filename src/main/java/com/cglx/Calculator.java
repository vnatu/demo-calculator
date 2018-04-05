package com.cglx;

public class Calculator {

    public Calculator() {
    }

    public int add(int a, int b)
    {
        return a+b;
    }

    public int multiply(int a, int b)
    {
        return a*b;
    }

    public  int divide(int a, int b)
    {
        return a/b;
    }

    public int substract(int a, int b)
    {
        int result = a - b;
        return result;
    }

    public int square(int a)
    {
        return a * a;
    }

    

    public int remainder(int a, int b)
    {
        int result = a%b;
        return result;
    }
}
