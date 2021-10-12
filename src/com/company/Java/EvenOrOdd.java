package com.company.Java;

import java.util.Scanner;

public class EvenOrOdd {
    //W.A.P to check no is even or odd.
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("Given number is even");
        }else {
            System.out.println("Given number is odd");
        }
    }
}