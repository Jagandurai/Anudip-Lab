1. Write a program for Arithmetic operations using Hierarchical Inheritance.



program:



// Base class
class Arithmetic {
    public void addition(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
}

// Derived class 1
class Subtraction extends Arithmetic {
    public void subtraction(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

// Derived class 2
class Multiplication extends Arithmetic {
    public void multiplication(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Subtraction sub = new Subtraction();
        sub.addition(10, 5);        // Inherited method
        sub.subtraction(10, 5);     // Own method

        Multiplication mul = new Multiplication();
        mul.addition(10, 5);        // Inherited method
        mul.multiplication(10, 5); // Own method
    }
}




output:

addition: 15
Subtraction: 5
Addition: 15
Multiplication: 50



2. Write a program for Employee using Multilevel Inheritance.


program:



// Base class
class Person {
    String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void displayName() {
        System.out.println("Name: " + name);
    }
}

// Derived class 1
class Employee extends Person {
    int employeeId;
    
    public void setEmployeeId(int id) {
        this.employeeId = id;
    }
    
    public void displayEmployeeId() {
        System.out.println("Employee ID: " + employeeId);
    }
}

// Derived class 2
class Manager extends Employee {
    String department;
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void displayDepartment() {
        System.out.println("Department: " + department);
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.setName("Alice");
        mgr.setEmployeeId(12345);
        mgr.setDepartment("HR");
        
        mgr.displayName();
        mgr.displayEmployeeId();
        mgr.displayDepartment();
    }
}



Output:


name: Alice
Employee ID: 12345
Department: HR





3. Create an interface Animal with void sound() and void eat() an implement two classes Dog and Cat using these two abstract methods. 





program:


// Interface
interface Animal {
    void sound();
    void eat();
}

// Implementing class 1
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

// Implementing class 2
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
    
    public void eat() {
        System.out.println("Cat eats fish");
    }
}

// Main class
public class AnimalDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.eat();
        
        Animal myCat = new Cat();
        myCat.sound();
        myCat.eat();
    }
}



output:


Dog barks
Dog eats bones
Cat meows
Cat eats fish
