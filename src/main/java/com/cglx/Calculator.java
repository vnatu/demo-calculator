package com.cglx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
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

    private List<String> readFile(String filename)
    {
      List<String> records = new ArrayList<String>();
      try
      {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null)
        {
          records.add(line);
        }
        return records;
      }
      catch (Exception e)
      {
        //System.err.format("Exception occurred trying to read '%s'.", filename);
        e.printStackTrace();
        return null;
      }
    }

    public int remainder(int a, int b)
    {
        int result = a%b;
        return result;
    }
}
