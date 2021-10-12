package Exercise;

import java.util.Scanner;

public class Even_or_odd {
    /*Java Program to check whether a number is even or odd*/
        public static void main(String args[])
        {
            //To take input from the user
            //Create an object of scanner class
            Scanner input = new Scanner(System.in);
            int num;  //Declare a variable
            System.out.println("Enter a number:");
            num = input.nextInt();

            //If number is divisible by 2 then it's an even number
            //else odd number
            if ( num % 2 == 0 )
                System.out.println("The entered number is even");
            else
                System.out.println("The entered number is odd");
        }
}
