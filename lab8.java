1. Create hash map whose keys are1 to 15 and its values cube of keys.


Program:



import java.util.HashMap;

public class CubeHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> cubeMap = new HashMap<>();

        // Populate the HashMap with keys 1 to 15 and their cubes
        for (int i = 1; i <= 15; i++) {
            cubeMap.put(i, i * i * i);
        }

        // Display the HashMap
        System.out.println("Keys and their cubes:");
        for (Integer key : cubeMap.keySet()) {
            System.out.println("Key: " + key + ", Cube: " + cubeMap.get(key));
        }
    }
}



Output:

PS G:\Java\lab8> javac CubeHashMap.java
PS G:\Java\lab8>java CubeHashMap
Keys and their cubes:
Key: 1, Cube: 1
Key: 2, Cube: 8
Key: 3, Cube: 27
Key: 4, Cube: 64
Key: 5, Cube: 125
Key: 6, Cube: 216
Key: 7, Cube: 343
Key: 8, Cube: 512
Key: 9, Cube: 729
Key: 10, Cube: 1000
Key: 11, Cube: 1331
Key: 12, Cube: 1728
Key: 13, Cube: 2197
Key: 14, Cube: 2744
Key: 15, Cube: 3375




2. Create two thread.one thread is finding average of first 50 numbers and other thread is printing square of number store in array arr={10,15,20,25,30}



Program:



class AverageThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        double average = sum / 50.0;
        System.out.println("Average of first 50 numbers: " + average);
    }
}

class SquareThread extends Thread {
    private int[] arr = {10, 15, 20, 25, 30};

    public void run() {
        System.out.println("Squares of numbers in the array:");
        for (int num : arr) {
            System.out.println("Square of " + num + ": " + (num * num));
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        AverageThread avgThread = new AverageThread();
        SquareThread squareThread = new SquareThread();

        avgThread.start();
        squareThread.start();

        try {
            avgThread.join();
            squareThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




Output:


PS G:\Java\lab8> javac ThreadExample.java
PS G:\Java\lab8>java ThreadExample
Average of first 50 numbers: 25.5
Squares of numbers in the array:
Square of 10: 100
Square of 15: 225
Square of 20: 400
Square of 25: 625
Square of 30: 900




3. write a program to create Book management system.

create class name Book, and perform following actions:

Attributes:

bookid ,bookName, bookPrice, authorName,l ibrary name(static),availability

method:

createBook() will store book details.(add  3 books).

deleteBook() will delete book by Id

displayBook()will display book details


Program:


import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private int bookId;
    private String bookName;
    private double bookPrice;
    private String authorName;
    static String libraryName = "Central Library";
    private boolean availability;

    // Constructor
    public Book(int bookId, String bookName, double bookPrice, String authorName, boolean availability) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = availability;
    }

    public int getBookId() {
        return bookId;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId + ", Name: " + bookName + ", Price: " + bookPrice + 
                           ", Author: " + authorName + ", Library: " + libraryName + 
                           ", Available: " + (availability ? "Yes" : "No"));
    }
}

public class BookManagementSystem {
    private ArrayList<Book> books = new ArrayList<>();

    public void createBook() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Book ID:");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.println("Enter Book Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Book Price:");
            double price = scanner.nextDouble();
            scanner.nextLine();  // Consume newline
            System.out.println("Enter Author Name:");
            String author = scanner.nextLine();
            System.out.println("Is the book available? (true/false):");
            boolean available = scanner.nextBoolean();
            books.add(new Book(id, name, price, author, available));
        }
    }

    public void deleteBook(int id) {
        books.removeIf(book -> book.getBookId() == id);
        System.out.println("Book with ID " + id + " deleted.");
    }

    public void displayBooks() {
        for (Book book : books) {
            book.displayBook();
        }
    }

    public static void main(String[] args) {
        BookManagementSystem bms = new BookManagementSystem();
        bms.createBook();
        System.out.println("\nDisplaying all books:");
        bms.displayBooks();
        
        // Example of deleting a book
        bms.deleteBook(1);
        System.out.println("\nDisplaying all books after deletion:");
        bms.displayBooks();
    }
}



Output:


Enter Book ID:
1
Enter Book Name:
Java Programming
Enter Book Price:
39.99
Enter Author Name:
John Doe
Is the book available? (true/false):
true
Enter Book ID:
2
Enter Book Name:
Data Structures
Enter Book Price:
29.99
Enter Author Name:
Jane Doe
Is the book available? (true/false):
false
Enter Book ID:
3
Enter Book Name:
Web Development
Enter Book Price:
49.99
Enter Author Name:
Alice Smith
Is the book available? (true/false):
true

Displaying all books:
Book ID: 1, Name: Java Programming, Price: 39.99, Author: John Doe, Library: Central Library, Available: Yes
Book ID: 2, Name: Data Structures, Price: 29.99, Author: Jane Doe, Library: Central Library, Available: No
Book ID: 3, Name: Web Development, Price: 49.99, Author: Alice Smith, Library: Central Library, Available: Yes
Book with ID 1 deleted.

Displaying all books after deletion:
Book ID: 2, Name: Data Structures, Price: 29.99, Author: Jane Doe, Library: Central Library, Available: No
Book ID: 3, Name: Web Development, Price: 49.99, Author: Alice Smith, Library: Central Library, Available: Yes
