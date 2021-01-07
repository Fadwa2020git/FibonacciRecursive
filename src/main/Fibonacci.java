package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {


        System.out.println("Please enter how many Fibonacci numbers you would like to see");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        scanner.close();
        displayFibonacciNumbers(max);
    }
    public static void displayFibonacciNumbers(int max) {
        int n = 1;
        ArrayList<Integer> fibList = new ArrayList<>();
        while(n<=max) {
            fibList.add(Integer.valueOf(getFibonacciNumber(n)));
            ++n;
        }
        System.out.println("List of Fibonacci numbers :");
        for (Object o : fibList) {
            System.out.println(o.toString());
        }
    }
    public static int getFibonacciNumber(int position) {
        //recursive method
        //first stop condition
        int u1 = 1, u2 = 1;
        if (position == 1)
            return u1;
        //second stop condition
        else if (position == 2)
            return u2;
        else {
            return getFibonacciNumber(position -1) + getFibonacciNumber(position -2);
        }
    }
}
