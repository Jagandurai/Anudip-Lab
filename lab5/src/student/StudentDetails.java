package student;

public class StudentDetails {
    private String name;
    private int rollNumber;

    public StudentDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
