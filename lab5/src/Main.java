import addition.Add;
import subtraction.Subtract;
import multiplication.Multiply;
import division.Divide;
import person.PersonalDetails;
import person.Address;
import person.Employment;
import student.StudentDetails;
import student.Marks;
import student.Result;

public class Main {
    public static void main(String[] args) {
        // Arithmetic Operations
        Add adder = new Add();
        Subtract subtractor = new Subtract();
        Multiply multiplier = new Multiply();
        Divide divider = new Divide();

        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + adder.add(a, b));
        System.out.println("Subtraction: " + subtractor.subtract(a, b));
        System.out.println("Multiplication: " + multiplier.multiply(a, b));
        System.out.println("Division: " + divider.divide(a, b));

        // Personal Details
        PersonalDetails person = new PersonalDetails("Alice", 30);
        Address address = new Address("123 Main St", "Springfield");
        Employment employment = new Employment("Software Engineer", "Tech Corp");

        System.out.println("\nPersonal Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity());
        System.out.println("Job Title: " + employment.getJobTitle());
        System.out.println("Company: " + employment.getCompany());

        // Student Details
        StudentDetails student = new StudentDetails("Bob", 101);
        Marks marks = new Marks(new int[]{85, 90, 78, 92});

        System.out.println("\nStudent Details:");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Average Marks: " + Result.calculateAverage(marks.getSubjectMarks()));
    }
}
