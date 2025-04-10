package com.pluralsight;

import javax.xml.namespace.QName;

public class MathApp {
    public static void main(String[] args) {

        // Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary. Determine whose salary is greater using Math.max() and
        //store the answer in highestSalary. Set the initial salary variables to any value
        //you want. Print the answer (i.e "The highest salary is ...")
        double bobSalary = 56600.00;
        double garySalary = 68000.00;
        double highestSalary = Math.max(bobSalary, garySalary);

        // Find and display the smallest of two variables named carPrice and
        //truckPrice. Set the variables to any value you want.
        double carPrice = 27000.00;
        double truckPrice = 47000.00;
        double smallestPrice = Math.min(carPrice, truckPrice);

        // Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        // Find and display the square root a variable after it is set to 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        // Find the distance between two points: (5, 10) and (85, 50)
        // As I understand we need to find hypotenuse
        // I want to use Pythagorean Theorem c^2 = x^2 + y^2
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        // We need to find the dif in x and y
        double dif_x = x2 - x1;
        double dif_y = y2 - y1;

        // We need to square each leg
        double dif_xSquared = Math.pow(dif_x, 2);
        double dif_ySquared = Math.pow(dif_y, 2);

        // We need to add the squares and take the square root
        double x_ySquares = dif_xSquared + dif_ySquared;
        double distance = Math.sqrt(x_ySquares);

        // Find and display the absolute (positive) value of a variable after it is set to -3.8
        double num = -3.8;
        double absoluteNum = Math.abs(num);

        // Find and display a random number between 0 and 1
        double randomNum = Math.random();

        System.out.println("The highest salary is: " + highestSalary);
        System.out.println("The smallest price is: " + smallestPrice);
        System.out.println("The area of a circle is: " + area);
        System.out.println("The square root of " + number + " is " + squareRoot);
        System.out.println("The distance between the points (5, 10) and (85, 50) = " + distance);
        System.out.println("The absolute value of " + num + " is " + absoluteNum);
        System.out.println("The random number between 0 and 1 is : " + randomNum);

    }
}
