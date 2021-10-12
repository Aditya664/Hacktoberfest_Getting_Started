package com.company.Java;

import java.util.Scanner;

public class ArithmaticOper{
    //W.A.P to Create operations on it.
    public static void main(String[] args) {
        int n1,n2;
        char operator;
        int result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        System.out.println("Please enter operator: ");
        operator = in.next().charAt(0);
        if (operator == '+'){
            result = n1+n2;
        }
        else if (operator == '-'){
            result = n1-n2;
        }
        else if (operator == '*'){
            result = n1*n2;
        }
        else if (operator == '/'){
            result = n1/n2;
        }
        else if (operator == '%'){
            result = n1%n2;
        }else {
            System.out.println("Please check the input.");
        }
        System.out.println(result);

    }
}