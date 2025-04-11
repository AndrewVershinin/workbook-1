package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double regularPrice = 5.45;
        double largePrice = 8.95;
        double finalPrice = 0;

        System.out.println("Choose the size of the sandwich: ");
        System.out.printf("1: Regular: base price $%.2f\n ", regularPrice);
        System.out.printf("2: Large: base price $%.2f\n", largePrice);

        System.out.print("Enter 1 or 2: ");
        int user_choice = input.nextInt();

        System.out.println("What is your age?: ");
        int user_age = input.nextInt();

        if (user_choice == 1) {
            finalPrice = regularPrice;
        } else if (user_choice == 2) {
            finalPrice = largePrice;
        } else {
            System.out.println("Please choose the size of the sandwich (1 or 2)");
            return;
        }

        if (user_age <= 17) {
            finalPrice *= 0.9;
        } else if (user_age >= 65){
            finalPrice *= 0.8;
        }

        System.out.printf("Your final sandwich price if: $%.2f\n", finalPrice);
    }

}
