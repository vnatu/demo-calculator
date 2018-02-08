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
        return a - b;
    }

    public int square(int a)
    {
        return a*a;
    }

    public boolean areEqual(int f1, int f2) {
        return f1 == f2;
    }
}
