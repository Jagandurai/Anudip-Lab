1. Write a program to enter P,T  and calculate simple interest. 


program:

import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the time in years
        System.out.print("Enter the time in years (T): ");
        double time = scanner.nextDouble();

        // Prompt the user to enter the rate of interest
        System.out.print("Enter the rate of interest (R): ");
        double rate = scanner.nextDouble();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The simple interest is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}


ouput:

PS G:\Java> javac SimpleInterestCalculator.java
PS G:\Java> java SimpleInterestCalculator      
Enter the principal amount (P): 1000
Enter the time in years (T): 5
Enter the rate of interest (R): 3.5
The simple interest is: 175.0




2.  Write a program which calculates the monthly bill amount for EB.





program:


import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        // Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of units consumed
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate bill amount
        double billAmount = calculateBill(units);

        // Display the bill amount
        System.out.printf("The monthly electricity bill amount is: %.2f\n", billAmount);
    }

    /**
     * Method to calculate the electricity bill based on units consumed.
     * @param units The number of units consumed.
     * @return The total bill amount.
     */
    public static double calculateBill(int units) {
        double bill = 0.0;

        if (units <= 100) {
            bill = units * 1.5; // Rate for first 100 units
        } else if (units <= 300) {
            bill = (100 * 1.5) + ((units - 100) * 2.5); // Rate for 101 to 300 units
        } else {
            bill = (100 * 1.5) + (200 * 2.5) + ((units - 300) * 4.0); // Rate for above 300 units
        }

        // Add fixed charge
        bill += 50; // Fixed charge for all bills

        // Return the calculated bill amount
        return bill;
    }
}



ouput:


PS G:\Java> javac ElectricityBillCalculator.java
PS G:\Java> java ElectricityBillCalculator
Enter the number of units consumed: 5
The monthly electricity bill amount is: 57.50



3.  Write a program to calculate area of Rectangle, Square, Circle and Triangle using constructor overloading.



program:


public class ShapeAreaCalculator {

    // Constructor for Rectangle
    public ShapeAreaCalculator(double length, double width) {
        double area = length * width;
        System.out.printf("Area of Rectangle: %.2f\n", area);
    }

    // Constructor for Square
    public ShapeAreaCalculator(double side) {
        double area = side * side;
        System.out.printf("Area of Square: %.2f\n", area);
    }

    // Constructor for Circle
    public ShapeAreaCalculator(double radius, boolean isCircle) {
        if (isCircle) {
            double area = Math.PI * radius * radius;
            System.out.printf("Area of Circle: %.2f\n", area);
        }
    }

    // Constructor for Triangle
    public ShapeAreaCalculator(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            double area = 0.5 * base * height;
            System.out.printf("Area of Triangle: %.2f\n", area);
        }
    }

    public static void main(String[] args) {

        // Rectangle
        new ShapeAreaCalculator(5.0, 3.0);

        // Square
        new ShapeAreaCalculator(4.0);

        // Circle
        new ShapeAreaCalculator(7.0, true);

        // Triangle
        new ShapeAreaCalculator(6.0, 8.0, true);
    }
}



ouput:


PS G:\Java> javac ShapeAreaCalculator.java
PS G:\Java> java ShapeAreaCalculator
Area of Rectangle: 15.00
Area of Square: 16.00
Area of Circle: 153.94
Area of Triangle: 24.00



