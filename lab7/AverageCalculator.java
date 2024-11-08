public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0; 
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
    
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        double average = calculateAverage(values);
        System.out.println("Average: " + average);
    }
}
