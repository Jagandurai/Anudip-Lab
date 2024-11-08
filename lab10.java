Q.1 Write a Java method that takes two integers as input and returns their division result. Handle the ArithmeticException that may occur if the second integer is zero. Write a JUnit test for this method.


program:



public class DivisionCalculator {
    public static double divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println("Result: " + divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}


Output:


Error: Cannot divide by zero.


JUnit test


Q.2 Write a Java program that asks the user to enter an integer. Handle the InputMismatchException that may occur if the user enters something that is not an integer.

program:


import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        try {
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}


Output:


Enter an integer: abc
Error: Please enter a valid integer.


Q.3 Write a Java program that attempts to open a file (e.g., "sample.txt") and handle the FileNotFoundException that may occur if the file does not exist.




program:



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}

Output:


Error: File not found.





Q.4 Write a Java class EmailValidator with a method isValid that checks whether a given email address is valid. Write a JUnit test for this method.



program:




import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static boolean isValid(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static void main(String[] args) {
        String email = "test@example.com";
        System.out.println("Is valid email: " + isValid(email));
    }
}




Output:


Is valid email: true



JUnit test

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivisionCalculatorTest {
    @Test
    public void testDivide() {
        assertEquals(2.0, DivisionCalculator.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            DivisionCalculator.divide(10, 0);
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    @Test
    public void testValidEmail() {
        assertTrue(EmailValidator.isValid("test@example.com"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(EmailValidator.isValid("test@.com"));
    }
}






