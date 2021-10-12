package Exercise;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args)
    {
        Scanner op = new Scanner(System.in);
        int n = op.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while(count <= n)
        {
            int temp = i;
            i = i + p;
            p = temp;
            count++;

        }
        System.out.println(i);
    }
}
