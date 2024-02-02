package com.settingsthingsup;

/**
 * Hello world!
 *
 */
public class App 
{
    int add(int a , int b)
    {
        return a+b;
    }
    int subtract(int a , int b)
    {
        return a-b;
    }
    int multiply(int a , int b)
    {
        return a*b;
    }
    int divide(int a , int b)
    {
        return a/b;
    }

    public static void main(String[] args)
    {
        App cal = new App();
        int result = cal.subtract(7, 4);
        System.out.println(result);
    }
}
