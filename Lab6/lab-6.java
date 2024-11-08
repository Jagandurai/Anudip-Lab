1. write a program for sorting the number in ascending order array without using sort() method.


Program:


import java.util.Arrays;

public class AscendingSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        ascendingSort(array);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(array));
    }

    public static void ascendingSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}


Output:

Sorted array in ascending order: [1, 2, 3, 5, 8]


2. WAP to descending order array using sort() method.


program:


import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {
        Integer[] array = {5, 2, 8, 1, 3};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(array));
    }
}


output:

Sorted array in descending order: [8, 5, 3, 2, 1]





3. WAP to find the particular element.


Program:




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

Input

Enter the element to find: 30


Output:

Element 30 is not found in the array.


4. WAP to find the biggest number of given array.



program:

public class BiggestNumber {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        int biggest = findBiggestNumber(array);
        System.out.println("The biggest number in the array is: " + biggest);
    }

    public static int findBiggestNumber(int[] array) {
        int biggest = array[0]; // Assume the first element is the biggest
        for (int num : array) {
            if (num > biggest) {
                biggest = num; // Update biggest if a larger number is found
            }
        }
        return biggest;
    }
}



output:


The biggest number in the array is: 8












