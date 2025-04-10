package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = input.next();

        System.out.print("How many hours you worked: ");
        float worked_hours = input.nextFloat();

        System.out.print("What is your pay rate: ");
        float pay_rate = input.nextFloat();

        double gross_pay = pay_rate * worked_hours;

        System.out.printf("\nYour name: %s, Hours you worked: %.2f, Pay rate: %.2f, Gross pay: %.2f\n", name, worked_hours, pay_rate, gross_pay);
    }
}
