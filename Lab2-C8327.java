Q.1 Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

public class Student {
    // Define instance variables
    String name;
    int roll_no;

    public static void main(String[] args) {
        // Create an object of the Student class
        Student student1 = new Student();

        // Assign values to the object's variables
        student1.name = "John";
        student1.roll_no = 2;

        // Print the values
        System.out.println("Name: " + student1.name);
        System.out.println("Roll No: " + student1.roll_no);
    }
}

Q.2  Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

class Student {
    String name;
    int roll_no;
    String phone_no;
    String address;

    // Constructor to initialize the variables
    Student(String name, int roll_no, String phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Phone No: " + phone_no);
        System.out.println("Address: " + address);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating two objects of the Student class
        Student student1 = new Student("Sam", 1, "123-456-7890", "123 Elm Street");
        Student student2 = new Student("John", 2, "098-765-4321", "456 Oak Street");

        // Displaying the details of both students
        student1.displayDetails();
        student2.displayDetails();
    }
}



Q.3 Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.


import java.util.Scanner;

class Average {
    // Method to calculate and print the average of three numbers
    void calculateAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Create an object of the Average class
        Average avg = new Average();

        // Calculate and print the average
        avg.calculateAverage(num1, num2, num3);

        scanner.close();
    }
}






Q.4 Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat




class Employee {
    String name;
    int yearOfJoining;
    String address;

    // Constructor to initialize employee details
    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.printf("%-15s %-20d %-20s\n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
        // Creating objects for three employees
        Employee emp1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, "26B- WallsStreat");

        // Printing the header
        System.out.printf("%-15s %-20s %-20s\n", "Name", "Year of joining", "Address");
        System.out.println("------------------------------------------------------------");

        // Displaying details of each employee
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
