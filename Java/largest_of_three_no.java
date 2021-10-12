package Exercise;

import java.util.Scanner;

public class largest_of_three_no {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner op = new Scanner(System.in);
        a = op.nextInt();
        b = op.nextInt();
        c = op.nextInt();

        //Q.find the largest of the three numbers.

        int max = a;
        if(max < b)
        {
            max = b;
        }
        if(max < c)
        {
            max = c;
        }


        System.out.println("Largest number is: "+ max);
    }
}
