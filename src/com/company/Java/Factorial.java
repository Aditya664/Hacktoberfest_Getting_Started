package com.company.Java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, fact = 1;
        System.out.println("Please enter the: ");
        num = in.nextInt();
        for(int i = 1; i<=num; i++) {
            fact = fact * i;
        }
        System.out.println("Facorial of the " + num + " is: "+ fact);
    }
}