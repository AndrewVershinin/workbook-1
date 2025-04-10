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

        double gross_pay;

        if (worked_hours > 40) {
            float overtime_hours = worked_hours - 40;
            gross_pay = (40 * pay_rate) + (overtime_hours * pay_rate * 1.5);
        } else {
            gross_pay = worked_hours * pay_rate;
        }

        System.out.printf("\nYour name: %s, Hours you worked: %.2f, Pay rate: %.2f, Gross pay: %.2f\n", name, worked_hours, pay_rate, gross_pay);
    }
}
