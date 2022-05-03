package com.bitesbytes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int value = input.nextInt();
	System.out.print(Integer.toBinaryString(value));
    }
}
