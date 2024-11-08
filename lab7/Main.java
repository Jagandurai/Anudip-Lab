class Student {
    String name;
    int age;
    char grade;

    // Constructor to initialize the Student object
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        // Declare an array of Student objects
        Student[] students = new Student[5];

        // Initialize each object in the array
        students[0] = new Student("Alice", 20, 'A');
        students[1] = new Student("Bob", 21, 'B');
        students[2] = new Student("Charlie", 22, 'C');
        students[3] = new Student("Diana", 20, 'A');
        students[4] = new Student("Evan", 19, 'B');
        
        // Displaying the students (for verification)
        for (Student student : students) {
            System.out.println(student.name + ", " + student.age + ", " + student.grade);
        }
    }
}
 