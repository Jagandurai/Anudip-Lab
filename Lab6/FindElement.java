import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to find: ");
        int element = scanner.nextInt();

        boolean found = findElement(array, element);
        if (found) {
            System.out.println("Element " + element + " is found in the array.");
        } else {
            System.out.println("Element " + element + " is not found in the array.");
        }
    }

    public static boolean findElement(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }
}
