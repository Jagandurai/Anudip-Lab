public class StudentFinder {
    public static int findStudentByName(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(name)) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 20, 'A'),
            new Student("Bob", 21, 'B'),
            new Student("Charlie", 22, 'C'),
            new Student("Diana", 20, 'A'),
            new Student("Evan", 19, 'B')
        };

        String searchName = "Charlie";
        int index = findStudentByName(students, searchName);
        
        if (index != -1) {
            System.out.println(searchName + " found at index: " + index);
        } else {
            System.out.println(searchName + " not found.");
        }
    }
}
