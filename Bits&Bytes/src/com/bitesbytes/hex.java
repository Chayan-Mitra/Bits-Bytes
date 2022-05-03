package com.bitesbytes;
import javax.swing.*;

public class hex {
    public static void main(String[] args) throws InterruptedException {
        JOptionPane.showMessageDialog(null, "Hex - Starting up");
        System.out.print("==========================================================================================================================");
        System.out.println();
        System.out.print("                                                             Hex                             Version:1.0         ");
        System.out.println();
        System.out.print("==========================================================================================================================");
        System.out.println();
        System.out.print("Your results will be shown below -:");
        System.out.println();
        while (true)
        {
            String question =  JOptionPane.showInputDialog("Enter a hexadecimal number...");
            String getQuestion = question.toLowerCase();
            String values = "0123456789abcdef";
            int result = 0;
            for (int i = 0; i < getQuestion.length(); i++) {
                char pointer = getQuestion.charAt(i);
                int index = values.indexOf(pointer);
                result = 16 * result + index;
            }
            System.out.println("The decimal conversion of " + question + " is " + result);
        }
    }

}