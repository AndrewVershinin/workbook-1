package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = input.nextFloat();

        System.out.print("Enter the first second number : ");
        float num2 = input.nextFloat();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubstract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        char option = input.next().charAt(0);

        float result = num1 * num2;

        System.out.printf("\n%.2f * %.2f = %.2f\n", num1, num2, result);

    }
}
