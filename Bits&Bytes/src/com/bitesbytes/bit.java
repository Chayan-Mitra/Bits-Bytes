package com.bitesbytes;
import java.util.Scanner;
public class bit {
    public static void binary(int num)
    {
        int[] binary = new int[40];
        int index = 0;
        while (num > 0)
        {
            binary[index++] = num%2;
            num = num/2;
        }
        for (int i = index-1; i >= 0; i--)
        {
            System.out.print(binary[i]);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("==========================================================================================================================");
        System.out.println();
        System.out.print("                                                             Bits & Bytes                             Version:1.0         ");
        System.out.println();
        System.out.print("==========================================================================================================================");
        System.out.println();
        while (true)
        {
            System.out.println("1 ) Use in-build logic.");
            System.out.println("2 ) Use custom logic.");
            System.out.print("Bit&Bytes >");
            int answer = input.nextInt();
            if (answer == 1)
            {
                System.out.print("Enter a number : ");
                int num = input.nextInt();
                System.out.println("The binary value of " + num + " is " + Integer.toBinaryString(num));
            }
            else {
                System.out.print("Enter a number : ");
                int value = input.nextInt();
                System.out.println("The binary value of - " + value);
                binary(value);
            }
        }
    }
}
