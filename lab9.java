Q1) WAP for handling DivideByZeroException.

Program:



import java.util.Scanner;

public class DivideByZeroExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();
            
            int result = numerator / denominator;  // May cause DivideByZeroException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            sc.close();
        }
    }
}



Output:

PS G:\Java\lab9>javac DivideByZeroExample.java
PS G:\Java\lab9>java DivideByZeroExample
Enter the numerator: 10
Enter the denominator: 0
Error: Cannot divide by zero.



Q2) WAP for handling IOException.

Program:

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            FileReader fr = new FileReader(file);
        } catch (IOException e) {
            System.out.println("Error: File not found or unable to read.");
        }
    }
}



Output:


PS G:\Java\lab9>javac IOExceptionExample.java
PS G:\Java\lab9>java IOExceptionExample
Error: File not found or unable to read.




Q3) WAP for storing 10 student records from the user using the Array of the object and handling ArrayIndexOutOfBoundException.

Program:

import java.util.Scanner;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentRecordExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];

        try {
            for (int i = 0; i < 12; i++) { // Intentionally going out of bounds for testing
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter student age: ");
                int age = sc.nextInt();
                sc.nextLine(); // consume the leftover newline

                students[i] = new Student(name, age);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid index in the array.");
        } finally {
            sc.close();
        }
    }
}



Output:


PS G:\Java\lab9>javac StudentRecordExample.java
PS G:\Java\lab9>java StudentRecordExample
Enter student name: John
Enter student age: 20
Enter student name: Mary
Enter student age: 22
Error: Attempted to access an invalid index in the array.




Q4) Write a program for voting Application, take the user’s age as input and explicitly throw the exception if the user’s age is less than 18 to terminate the program.

Program:



import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("You must be at least 18 years old to vote.");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}



Output:

PS G:\Java\lab9>javac VotingApplication.java
PS G:\Java\lab9>java VotingApplication
Enter your age: 16
You must be at least 18 years old to vote.




Q5) WAP for handling NumberFormatException.

Program:

import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();
            int number = Integer.parseInt(input);  // May cause NumberFormatException
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}



Output:


PS G:\Java\lab9>javac NumberFormatExceptionExample.java
PS G:\Java\lab9>java NumberFormatExceptionExample
Enter a number: ABC
Error: Please enter a valid integer.
